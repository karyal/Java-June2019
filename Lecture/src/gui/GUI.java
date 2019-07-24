package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTextField;
import jdbc.DB_Person;

public class GUI implements ActionListener{
    JFrame frame;
    JMenuBar menu_bar1;
    JMenu menu_1;
    JMenuItem menu_item1;
    JTextField txt_id;
    JPasswordField txt_password;
    JTextArea txt_comment;
    JRadioButton rb1, rb2;
    JCheckBox ch1, ch2;
    JComboBox cmb1;
    JList lst1;
    JButton btn_save;
    
    public GUI(){
        frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setTitle("Main window");
        frame.setSize(350, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add controls
        menu_bar1=new JMenuBar();
        menu_1=new JMenu("File");
        menu_item1=new JMenuItem("ADD");
        menu_item1.addActionListener(this);
        menu_1.add(menu_item1);
        menu_bar1.add(menu_1);
        
        txt_id = new JTextField();
        txt_id.setColumns(10);
        
        txt_password=new JPasswordField();
        txt_password.setColumns(10);
        txt_password.setEchoChar('@');
       
        txt_comment = new JTextArea(5, 20);
        txt_comment.setText("<Comment>");
        
        rb1= new JRadioButton("Male", true);
        rb2= new JRadioButton("Female");
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        
        ch1=new JCheckBox("Reading");
        ch2=new JCheckBox("Playing", true);
        
        String[] str={"1-14","15-29","30-44","45+"};
        cmb1=new JComboBox(str);
        cmb1.setSelectedIndex(1);
        
        String str_list [] = {"Bhaktapur","Lalitpur","Kathmandu"};
        lst1 =new JList(str_list);
        lst1.setVisibleRowCount(2);
        
        btn_save=new JButton();
        btn_save.setText("Save");
        btn_save.addActionListener(this);
        //frame.add(menu_bar1);
        //frame.add(txt_password);
        //frame.add(txt_comment);
        
        frame.add(txt_id);
        
        frame.add(rb1);
        frame.add(rb2);
        frame.add(ch1);
        frame.add(ch2);
        frame.add(cmb1);
        frame.add(lst1);
        frame.add(btn_save);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new GUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_save){
            System.out.println("ADDING.......");
            int id;
            String gender;
            byte hb1=0, hb2=0;//0-false/1-true
            String age_grp;
            String address;
            id=Integer.parseInt(txt_id.getText());
            if(rb1.isSelected()==true){
                gender="Male";
            }else{
                gender="Female";
            }
            if(ch1.isSelected()==true)
                hb1=1;
            if(ch2.isSelected()==true)
                hb2=1;
           age_grp=cmb1.getSelectedItem().toString();
           address = lst1.getSelectedValue().toString();
           Person p=new Person(id, gender, hb1, hb2, age_grp, address);
           boolean res = new DB_Person().saveRecord(p);
           if(res){
               System.out.println("Save record sucessfully");
           }
           else{
               System.out.println("Error to save record");
           }
           
           System.out.println(id+" "+gender+" "+hb1+" "+hb2+" "+age_grp+" "+address);
        }
    }
}
