using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Web;

namespace WebApplication1
{
    public class College
    {
      public  String Grade;
       
        public string display(string subject,int M1,int M2,int M3,int M4,int M5)
        {
            int Total;
            
            Total=M1+M2+M3+M4+M5;
           
            
            if(Total > 250)
            {
                Grade = "A grade";
            }
            else
            {
              Grade = "B grade";
            }
            return Total.ToString();
            
        }
        
    }
}