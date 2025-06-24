using Microsoft.Ajax.Utilities;
using MVCwithADO.Models;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MVCwithADO.Controllers
{
    public class StudentController : Controller
    {
        StudentDAL studentDAL=new StudentDAL();
        public ViewResult DisplayStudents() 
        { 
            return View(studentDAL.GetStudents(true));
        }  
        public ViewResult DisplayStudent(int Sid)
        {
            return View(studentDAL.GetStudent(Sid,true));
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
                string physicalPath = Server.MapPath("~/Uploads/");
                if (!Directory.Exists(physicalPath))
                {
                    Directory.CreateDirectory(physicalPath);
                }
                    selectedFile.SaveAs(physicalPath+selectedFile.FileName);
                    student.Photo = selectedFile.FileName;
            }
         studentDAL.InsertStudent(student);
            return RedirectToAction("DisplayStudents");
        }

        [HttpGet]
        public ViewResult EditStudent(int Sid)
        {
            Student student= studentDAL.GetStudent(Sid,true);
            TempData["Photo"]=student.Photo;
            return View(student);
            
        }

        [HttpPost]
        public RedirectToRouteResult UpdateStudent(Student student,HttpPostedFileBase selectedFile)
        {
            if(selectedFile != null)
            {
                string physicalPath = Server.MapPath("~/Uploads/");
                if (Directory.Exists(physicalPath))
                {
                    Directory.CreateDirectory(physicalPath);
                }
                selectedFile.SaveAs (physicalPath+selectedFile.FileName);
                student.Photo = selectedFile.FileName;

            }
            else
            {
                student.Photo = TempData["Photo"].ToString();
            }
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