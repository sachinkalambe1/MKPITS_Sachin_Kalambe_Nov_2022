import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class sample implements ActionListener{

JFrame f1;
JTextField t1;
JTextField t2;
JTextField t3;
JButton b1;
JButton b2;
JButton b3;
JButton b4;

sample(){
	f1=new JFrame();
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	b1=new JButton("Add");
	b2=new JButton("sub");
	b3=new JButton("mult");
	b4=new JButton("div");

	f1.setVisible(true);
	t1.setbounds(100,100,50,30);
	t2.setbounds(200,100,50,30);
	t3.setbounds(300,100,50,30);

	f1.add(t1);
	f1.add(t2);
	f1.add(t3);
	f1.add(b1);
	f1.add(b2);
	f1.add(b3);
	f1.add(b4);

	b1.addActioListener();
	b2.addActioListener();
	b3.addActioListener();
	b4.addActioListener();

	f1.setVisible(true);

	}

	public void actionPerformed(Action e)
	{
		if(e.getSource()==b1){
			String n1=getText();
			int s1=Integer.parseInt(n1);
			String n2=getText();
			int s2=Integer.parseInt(n2);

			int s3=s1+s2;
			String n3=Integer.toString(s3);
			t3.setText();

			}

		}

	}



class Arithmatic_GUI{
public static void main(String[]args)
{
new sample();
}
}