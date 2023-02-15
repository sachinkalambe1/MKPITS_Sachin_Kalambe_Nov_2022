import java.awt.*;
import java.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class sample //implements ActionListener
{

JFrame f1;
JTextField t1;
JTextField t2;
JTextField t3;
sample()
{
f1=new JFrame();
t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
f1.setVisible();
f1.add(t1);
f1.add(t2);
f1.add(t3);


}

}
class demoGUI
{
public static void main(String[]args)
{
new sample();
}
}
