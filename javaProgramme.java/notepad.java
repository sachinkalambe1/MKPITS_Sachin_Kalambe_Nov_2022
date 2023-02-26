import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


class demo implements ActionListener
{

	JFrame f1;
	JTextArea t1;
	JMenuBar menubar;
	JMenu file_menu;
	JMenu Edit_menu;
	JMenu view_menu;
	JMenuItem New_menuItem;
	JMenuItem open_menuItem;
	JMenuItem save_menuItem;
	JMenuItem saveAS_menuItem;
	JMenuItem Exit_menuItem;
	JMenuItem Paste_MenuItem;
	JMenuItem cut_MenuItem;
	JMenuItem copy_MenuItem;
	JMenuItem ZoomIN_MenItem;
	JMenuItem ZoomOut_MenItem;


	demo(){
	f1=new JFrame();
	t1=new JTextArea();
	menubar=new JMenuBar();
	file_menu=new JMenu("file");
	Edit_menu=new JMenu("Edit");
	view_menu=new JMenu("View");
	New_menuItem=new JMenuItem("New");
	open_menuItem=new JMenuItem("Open");
	save_menuItem=new JMenuItem("Save");
	saveAS_menuItem=new JMenuItem("SaveAs");
	Exit_menuItem=new JMenuItem("Exit");
	Paste_MenuItem=new JMenuItem("Paste");
	cut_MenuItem=new JMenuItem("cut");
	copy_MenuItem=new JMenuItem("copy");
	ZoomIN_MenItem=new JMenuItem("ZoonIn");
	ZoomOut_MenItem=new JMenuItem("ZoomOut");


	f1.setJMenuBar(menubar);
	f1.add(t1);
	menubar.add(file_menu);
	menubar.add(Edit_menu);
	menubar.add(view_menu);
	file_menu.add(New_menuItem);
    file_menu.add(open_menuItem);
    file_menu.add(save_menuItem);
    file_menu.add(saveAS_menuItem);
    file_menu.add(Exit_menuItem);
    Edit_menu.add(Paste_MenuItem);
    Edit_menu.add(cut_MenuItem);
    Edit_menu.add(copy_MenuItem);
    view_menu.add(ZoomIN_MenItem);
    view_menu.add(ZoomOut_MenItem);

    open_menuItem.addActionListener(this);
    save_menuItem.addActionListener(this);
    saveAS_menuItem.addActionListener(this);

	f1.setVisible(true);
		}//constructor close
		public void actionPerformed(ActionEvent e)
		{

			if(e.getSource()==open_menuItem)
			{
				FileDialog fd=new FileDialog(f1,"open",FileDialog.LOAD);
				fd.setVisible(true);
				String s=fd.getFile();
				try{
				FileInputStream fs=new FileInputStream(s);
				System.out.println(fs.available());
				byte b[]=new byte[fs.available()];
				if(fs.read(b)!=-1)
				{
				}
				System.out.println(b.length);

				t1.setText(new String(b));
			}catch(Exception e1){}
				}

				if(e.getSource()==save_menuItem)
							{
								FileDialog fd=new FileDialog(f1,"save",FileDialog.SAVE);
								fd.setVisible(true);
				}
				if(e.getSource()==saveAS_menuItem)
											{
												FileDialog fd=new FileDialog(f1,"saveAs",FileDialog.SAVE);
												fd.setVisible(true);

												String s=fd.getFile();

																try{
																FileOutputStream fs=new FileOutputStream(s);
																String sk1=t1.getText();
																byte b[]=sk1.getBytes();
																fs.write(b);



			}catch(Exception e1){}

				}
			}

	}// class Close

class notepad{
public static void main(String[]args)
{
new demo();
}
}
