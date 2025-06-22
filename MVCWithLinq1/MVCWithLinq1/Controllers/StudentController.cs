using MVCWithLinq1.Models;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MVCWithLinq1.Controllers
{
    public class StudentController : Controller
    {
        StudentDAL studentDAL = new StudentDAL();
        public ViewResult DisplayStudents()
        {
            var Students = studentDAL.GetStudents(null);
            
            return View(Students);
        }
       public ViewResult DisplayStudent(int Sid)
        {
            var Student = studentDAL.GetStudent(Sid,true);
                return View(Student);
        }

      
        public ViewResult AddStudent()
        {

            return View();
        }
        [HttpPost]
        public RedirectToRouteResult AddStudent(Student student,HttpPostedFileBase selectedFile)
        {
            if (selectedFile != null)
            {
                string phyicalPath = Server.MapPath("~/Uploads/");
                if (!Directory.Exists(phyicalPath))
                
                    Directory.CreateDirectory(phyicalPath);
                
                selectedFile.SaveAs(phyicalPath+selectedFile.FileName);
                student.Photo = selectedFile.FileName;

            }
            student.Status = true;
            studentDAL.InsertStudent(student);

            return RedirectToAction("DisplayStudents");

        }
        public ViewResult EditStudent(int Sid)
        {
            var Student = studentDAL.GetStudent(Sid, true);
            TempData["Photo"]=Student.Photo;
            return View(Student);
        }
        public RedirectToRouteResult UpdateStudent(Student student,HttpPostedFileBase selectedFile)
        {
            if (selectedFile != null)
            {
                string phyicalPath = Server.MapPath("~/Uploads/");
                if (!Directory.Exists(phyicalPath))

                    Directory.CreateDirectory(phyicalPath);

                selectedFile.SaveAs(phyicalPath + selectedFile.FileName);
                student.Photo = selectedFile.FileName;

            }
            else if (TempData["Photo"]!=null)
                student.Photo = TempData["Photo"].ToString();

            student.Status = true;
            studentDAL.UpdateStudent(student);
            return RedirectToAction("DisplayStudents");
        }
        public RedirectToRouteResult DeleteStudent(int Sid)
        {
            studentDAL.DeleteStudent(Sid);
            return RedirectToAction("DisplayStudents");
        }
    }
}