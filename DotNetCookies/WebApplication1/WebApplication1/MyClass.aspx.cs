using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class MyClass : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            // ClassName objNmae= new ClassName();
            Student student = new Student();
            Label1.Text = student.display();
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            Student student= new Student();
            int a1,b1,c1;
            a1=int.Parse(TextBox1.Text);
            b1=int.Parse(TextBox2.Text);
            
            c1=student.addition(a1,b1);
            TextBox3.Text=c1.ToString();
        }
    }
}