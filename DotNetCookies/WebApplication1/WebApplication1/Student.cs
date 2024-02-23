using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication1
{

    public class Student
    {
        public string message;
        public string display()  // returning data to aspx page.
        {
            message = "This is my first class program";
            return message;
        }
        public int addition(int num1,int num2)
        {
            int result;
            result = num1+num2;
            return result;
        }
            
    }
}