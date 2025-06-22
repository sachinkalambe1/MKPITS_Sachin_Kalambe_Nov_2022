using System;
using System.Collections.Generic;
using System.Configuration;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Web;

namespace MVCWithLinq1.Models
{

    public class StudentDAL
    {
        MVCDBDataContext dc;
        public StudentDAL() 
        {
            string ConStr = ConfigurationManager.ConnectionStrings["MVCDBConnectionString"].ConnectionString;
            dc= new MVCDBDataContext(ConStr);
        }
      
        public List<Student> GetStudents(bool? Status)
        {
            List<Student> students;
            if (Status == null)
            {
                students = (from s in dc.Students select s).ToList();
            }
            else
            {
                students= (from s in dc.Students where s.Status == Status select s).ToList();
            }
            return students;
        }
        public Student GetStudent(int Sid, bool? Status)
        {
            Student students;

            if (Status == null)
            {
                students = dc.Students.FirstOrDefault(s =>s.Sid==Sid);
            }
            else
            {
                students = dc.Students.FirstOrDefault(s=>s.Sid==Sid && s.Status==Status);
            }

            return students;
        }
      public void InsertStudent(Student student)
        {
            try
            {
                dc.Students.InsertOnSubmit(student);
                dc.SubmitChanges();
            }
            catch (Exception ex)
            {
                throw ex;
            }
            
        }
        public void UpdateStudent(Student student)
        {
            try
            {
                Student OldStudnet = dc.Students.SingleOrDefault(S => S.Sid == student.Sid);
                OldStudnet.Name = student.Name;
                OldStudnet.Class = student.Class;
                OldStudnet.Fees = student.Fees;
                OldStudnet.Photo = student.Photo;
                OldStudnet.Status = student.Status;
                dc.SubmitChanges();
            }
            catch (Exception ex)
            {
                throw ex;
            }
            
        }
        public void DeleteStudent(int Sid)
        {
            try
            {
                Student OldStudent = dc.Students.SingleOrDefault(S => S.Sid == Sid);
                dc.Students.DeleteOnSubmit(OldStudent);
                dc.SubmitChanges();
            }
            catch(Exception ex)
            {
                throw ex;
            }
            
        }


    }
}