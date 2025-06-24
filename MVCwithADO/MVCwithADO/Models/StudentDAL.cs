using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Data;
using System.Threading;

namespace MVCwithADO.Models
{
    public class StudentDAL
    {
        SqlConnection con;
        SqlCommand cmd;
        public StudentDAL() 
        {
            string Constr = ConfigurationManager.ConnectionStrings["ConStr"].ConnectionString;
            con = new SqlConnection(Constr);
            cmd = new SqlCommand();
            cmd.Connection = con;
            cmd.CommandType = CommandType.StoredProcedure;

        }
        public List<Student> GetStudents(bool? Status)
        {
            List<Student> students = new List<Student>();
            try
            {
                cmd.CommandText = "Student_Select";
                cmd.Parameters.Clear();
                if(Status!=null)
                {
                    cmd.Parameters.AddWithValue("@Status",Status);
                    con.Open();
                    SqlDataReader dr=cmd.ExecuteReader();
                    while (dr.Read())
                    {
                        Student student = new Student
                        {
                            Sid = Convert.ToInt32(dr["Sid"]),
                            Name = dr["Name"].ToString(),
                            Class= Convert.ToInt32(dr["Class"]),
                            Fees = Convert.ToDecimal(dr["Fees"]),
                            Photo = dr["Photo"].ToString()

                        };
                        students.Add(student);
                    }
                }
            }catch (Exception ex)
            {
                throw ex;
            }
            finally 
            {
                con.Close(); 
            }
            return students;
        }

       public Student GetStudent(int Sid,bool? Status)
        {
            Student student = null;
            try
            {
                cmd.CommandText = "Student_Select";
                cmd.Parameters.Clear();
                cmd.Parameters.AddWithValue("Sid", Sid);
                if (Status != null)
                {
                    cmd.Parameters.AddWithValue("@Status", Status);
                    con.Open();
                    SqlDataReader dr = cmd.ExecuteReader();
                    while (dr.Read())
                    {
                        student = new Student();
                        student.Sid = Convert.ToInt32(dr["Sid"]);
                        student.Name = dr["Name"].ToString();
                        student.Class = Convert.ToInt32(dr["Class"]);
                        student.Fees = Convert.ToDecimal(dr["Fees"]);
                        student.Photo = dr["Photo"].ToString();
                    }
                }
            }
            catch (Exception ex)
            {
                throw ex;
            }
            finally 
            { 
                con.Close();
            }
            return student;
        }

        public int InsertStudent (Student student)
        {
            int Count = 0;
            try
            {
                cmd.CommandText = "Student_Insert";
                cmd.Parameters.Clear();
                cmd.Parameters.AddWithValue("@Sid", student.Sid);
                cmd.Parameters.AddWithValue("@Name", student.Name);
                cmd.Parameters.AddWithValue("@Class", student.Class);
                cmd.Parameters.AddWithValue("@Fees",student.Fees);
                
                if (student.Photo != null && student.Photo.Length!=0)
                {
                    cmd.Parameters.AddWithValue("@Photo", student.Photo);
                    con.Open();
                    Count = cmd.ExecuteNonQuery();
                }

            }catch (Exception ex)
            {
                throw ex;
            }
            finally
            {
                con.Close();
            }
            return Count;
        }
        public int UpdateStudent(Student student)
        {
            int count = 0;
            try
            {
                cmd.CommandText = "Student_Update";
                cmd.Parameters.Clear();
                cmd.Parameters.AddWithValue("@Sid", student.Sid);
                cmd.Parameters.AddWithValue("@Name", student.Name);
                cmd.Parameters.AddWithValue("@Class", student.Class);
                cmd.Parameters.AddWithValue("@Fees", student.Fees);
                if(student.Photo != null && student.Photo.Length != 0)
                {
                    cmd.Parameters.AddWithValue("Photo", student.Photo);
                    con.Open();
                    count = cmd.ExecuteNonQuery();
                }
                
            }
            catch(Exception ex) 
            {
                throw ex;
            }
            finally { con.Close(); }
            return count;
        }
        public void DeleteStudent(int Sid)
        {
            try
            {
                cmd.CommandText = "Student_Delete";
                cmd.Parameters.Clear();
                cmd.Parameters.AddWithValue("@Sid",Sid);
                con.Open() ;
                cmd.ExecuteNonQuery();
            }catch(Exception ex)
            {
                throw ex;
            }
            finally { con.Close(); }
        }
        
    }
}