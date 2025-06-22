using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MVCWithCodeFirstEF1.Controllers
{
    public class StudentController : Controller
    {
        public ViewResult GetStudent()
        {
            return View();
        }
    }
}