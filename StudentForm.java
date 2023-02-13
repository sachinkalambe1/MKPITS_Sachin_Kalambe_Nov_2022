import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentForm {
    private JPanel mainepanel;
    private JTextField textField_id;
    private JTextField textField_Mo;
    private JTextField textField_name;
    private JTextField textField_age;
    private JTextField textField_em;
    private JButton Insert;
    private JButton updateButton;
    private JButton deleteButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentForm");
        frame.setContentPane(new StudentForm().mainepanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    Connection con;
    void connect(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded succesfully");
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","Sachin@2000");
            System.out.println("database connected succefully");
    }catch(Exception e){
            System.out.println(e);
        }
    }


public StudentForm() {
        connect();
    Insert.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int uid=Integer.parseInt(textField_id.getText());
            String ename= textField_name.getText();
            int MObileNo=Integer.parseInt(textField_Mo.getText());
            int age=Integer.parseInt(textField_age.getText());
            String EmailId= textField_em.getText();
            try{
                Statement st=con.createStatement();
                int r=st.executeUpdate("insert into studentinfo values ("+uid+",'"+ename+"','"+MObileNo+"','"+age+"','"+EmailId+"')" );

            }catch(Exception ex){
                System.out.println(ex);
            }
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"hi insert");
        }
    })

    ;
}
}
