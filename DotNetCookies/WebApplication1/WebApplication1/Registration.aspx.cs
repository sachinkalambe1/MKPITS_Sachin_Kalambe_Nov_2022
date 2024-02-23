using System;
using System.Collections.Generic;
using System.Configuration;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class Registration : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            College college = new College();
            int a1, a2, a3, a4, a5;
            String subject;
             a1=int.Parse(TextBox5.Text);
            a2 = int.Parse(TextBox6.Text);
            a3 = int.Parse(TextBox7.Text);
            a4 = int.Parse(TextBox8.Text);
            a5 = int.Parse(TextBox9.Text);
            subject = TextBox4.Text;
           string Total= college.display(subject,a1, a2, a3, a3, a5);
            TextBox10.Text=Total.ToString();
            TextBox11.Text = college.Grade;
        }

        protected void Calendar1_SelectionChanged(object sender, EventArgs e)
        {
            // display selected date
            TextBox12.Text = Calendar1.SelectedDate.ToString("dd/MM/yyyy");
        }
    }
}