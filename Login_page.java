//import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class login implements ActionListener{

	JFrame f1;
	JFrame f2;

	JLabel l1;
	JTextField t1;
	JLabel l2;
	JPasswordField ps1;
	JButton b1;
	JButton b2;

JLabel l3;
	login()
	{
	f1=new JFrame();
	//f2=new JFrame();
	//f1.setDefaultCloseOperation(WindowsConstants.Exits_ON_ClOSE);

	l1=new JLabel("UserName");
	t1=new JTextField("Enter Username");
	l2=new JLabel("Password");
	ps1=new JPasswordField(20);
	b1=new JButton("Login");
	b2=new JButton("Reset");
	l3=new JLabel("Wlcm");

f1.setLayout(null);

l1.setBounds(100,100,200,100);
t1.setBounds(200,140,200,30);
l2.setBounds(100,150,200,100);
ps1.setBounds(200,190,200,30);
b1.setBounds(100,250,100,30);
b2.setBounds(300,250,100,30);

f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(ps1);
f1.add(b1);
f1.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
f2.add(l3);

f1.setVisible(true);
f2.setVisible(true);



		}
public void actionPerformed(ActionEvent e){

			if(e.getSource()==b1){
				//System.out.println("ok");

				f2.setVisible(true);
				}

				if(e.getSource()==b2)
				{
					System.out.println("Cancel");
					}
			}

	}



class Login_page
{
public static void main(String[]args)
{
new login();

}


}