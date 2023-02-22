import java.awt.*;

class Frme1
{
	Frame f1;
	Button b1;
	Label l1;
    TextField t1;
    Label l2;
    TextField t2;
   Label l3;
   Checkbox cb;
   Checkbox cb1;
   Checkbox cb2;
   Checkbox cb3;

	Frme1()
	{
f1=new Frame();
b1=new Button("ok");
t1=new TextField("Enter");
l1=new Label("Enter Student name");
l2=new Label("Enter your name Email Id");
t2=new TextField("Enter");
l3=new Label("Gender");
cb=new Checkbox();
cb1=new Checkbox("male",true);
cb2=new Checkbox("female",true);
cb3=new Checkbox("other",true);

f1.setLayout(null);

l1.setBounds(100,100,200,100);
t1.setBounds(300,140,200,30);
l2.setBounds(100,160,150,100);
t2.setBounds(300,200,200,30);
l3.setBounds(100,250,150,100);
cb1.setBounds(100,330,150,100);
cb2.setBounds(100,330,150,100);
cb3.setBounds(100,350,150,100);
	//add section
f1.add(b1);
f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
f1.add(l3);
f1.add(cb1);
f1.add(cb2);
f1.add(cb3);

//f1.setSize(100,50);
f1.setVisible(true);
		}
	}

class GUI_StudentApplication{

public static void main(String[]args){
new Frme1();

	}
	}