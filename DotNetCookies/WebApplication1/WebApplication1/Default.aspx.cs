using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            //create cookies
            Response.Cookies["Name"].Value=TxtData.Text;

            // Expire Cookies
            Response.Cookies["Name"].Expires = DateTime.Now.AddMinutes(1);

            Label1.Text = "Cookies Created";
            TxtData.Text = "";
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            //How to retrive cookies
            if (Request.Cookies["Name"] == null)
            {
                TxtRetriveData.Text = "NO cookies found";
            }
            else
            {
                TxtRetriveData.Text = Request.Cookies["Name"].Value;
            }
        }
    }
}