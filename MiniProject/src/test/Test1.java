<<<<<<< HEAD
package test;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Test1 {
    JFrame frame;
    
    public Test1(){
        frame=new JFrame();
        frame.setTitle("Student Result Processing");
        frame.setSize(350, 500);
        frame.setResizable(false);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Test1();
    }
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import classes.Student;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test1 implements ActionListener{
    JFrame frame;
    JLabel lbl_id, lbl_name, lbl_grade, lbl_section, lbl_m1, lbl_m2, lbl_m3, lbl_m4, lbl_total, lbl_average, lbl_result, lbl_division, lbl_remarks;
    JTextField txt_id, txt_name, txt_grade, txt_section, txt_m1, txt_m2, txt_m3, txt_m4, txt_total, txt_average, txt_result, txt_division, txt_remarks;
    JButton btn_process, btn_save, btn_close;
    Student student;
    public Test1(){
        frame=new JFrame();
        frame.setTitle("Student Mark Processing");
        frame.setSize(200, 350);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
    
        lbl_id = new JLabel();
        lbl_id.setText("ID : ");
        
        lbl_name = new JLabel();
        lbl_name.setText("NAME : ");
        
        lbl_grade = new JLabel();
        lbl_grade.setText("GRADE : ");
        
        lbl_section = new JLabel();
        lbl_section.setText("SECTION : ");
        
        lbl_m1 = new JLabel();
        lbl_m1.setText("MARKS 1 : ");
        
        lbl_m2 = new JLabel();
        lbl_m2.setText("MARKS 2 : ");
        
        lbl_m3 = new JLabel();
        lbl_m3.setText("MARKS 3 : ");
        
        lbl_m4 = new JLabel();
        lbl_m4.setText("MARKS 4 : ");
        
        lbl_total = new JLabel();
        lbl_total.setText("TOTAL : ");
        
        lbl_average = new JLabel();
        lbl_average.setText("AVERAGE : ");
                
        lbl_result = new JLabel();
        lbl_result.setText("RESULT : ");
        
        lbl_division = new JLabel();
        lbl_division.setText("DIVISION : ");
        
        lbl_remarks = new JLabel();
        lbl_remarks.setText("REMARKS : ");
        
        txt_id=new JTextField();
        txt_id.setColumns(10);
        txt_id.setText("<ID>");
        
        txt_name=new JTextField();
        txt_name.setColumns(10);
        txt_name.setText("<NAME>");
        
        txt_grade=new JTextField();
        txt_grade.setColumns(10);
        txt_grade.setText("<GRADE>");
        
        txt_section=new JTextField();
        txt_section.setColumns(10);
        txt_section.setText("<SECTION>");
        
        txt_m1=new JTextField();
        txt_m1.setColumns(10);
        txt_m1.setText("<MARKS-1>");
        
        txt_m2=new JTextField();
        txt_m2.setColumns(10);
        txt_m2.setText("<MARKS-2>");
        
        txt_m3=new JTextField();
        txt_m3.setColumns(10);
        txt_m3.setText("<MARKS-3>");
        
        txt_m4=new JTextField();
        txt_m4.setColumns(10);
        txt_m4.setText("<MARKS-4>");
        
        txt_total=new JTextField();
        txt_total.setColumns(10);
        txt_total.setText("<TOTAL>");
        
        txt_average=new JTextField();
        txt_average.setColumns(10);
        txt_average.setText("<AVERAGE>");
        
        txt_result=new JTextField();
        txt_result.setColumns(10);
        txt_result.setText("<RESULT>");
                
        txt_division=new JTextField();
        txt_division.setColumns(10);
        txt_division.setText("<DIVISION>");
        
        txt_remarks=new JTextField();
        txt_remarks.setColumns(10);
        txt_remarks.setText("<REMARKS>");
        
        btn_process=new JButton();
        btn_process.setText("PROCESS");
        btn_process.addActionListener(this);
        
        btn_save=new JButton();
        btn_save.setText("PROCESS");
        btn_save.addActionListener(this);
        
        btn_close=new JButton();
        btn_close.setText("CLOSE");
        btn_close.addActionListener(this);                
        
        student=new Student();
        
        frame.add(lbl_id);
        frame.add(txt_id);
        frame.add(lbl_name);
        frame.add(txt_name);
        frame.add(lbl_grade);
        frame.add(txt_grade);
        frame.add(lbl_section);
        frame.add(txt_section);        
        frame.add(lbl_m1);
        frame.add(txt_m1);
        frame.add(lbl_m2);
        frame.add(txt_m2);
        frame.add(lbl_m3);
        frame.add(txt_m3);
        frame.add(lbl_m4);
        frame.add(txt_m4);        
        frame.add(btn_process);
        frame.add(lbl_total);
        frame.add(txt_total);
        frame.add(lbl_average);
        frame.add(txt_average);
        frame.add(lbl_result);
        frame.add(txt_average);
        frame.add(lbl_division);
        frame.add(txt_division);
        frame.add(lbl_remarks);
        frame.add(txt_remarks);
        frame.add(btn_save);
        frame.add(btn_close);
        
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(btn_process)){
            int id, m1, m2, m3, m4;
            char section;
            String name, grade;
            id=Integer.parseInt(txt_id.getText());
            name=txt_name.getText();
            grade=txt_grade.getText();
            section=txt_section.getText().charAt(0);
            m1=Integer.parseInt(txt_m1.getText());
            m2=Integer.parseInt(txt_m2.getText());
            m3=Integer.parseInt(txt_m3.getText());
            m4=Integer.parseInt(txt_m4.getText()); 
            
            student.setId(id);
            student.setFullName(name);
            student.setGrade(grade);
            student.setSection(section);
            student.setM1(m1);
            student.setM2(m2);
            student.setM3(m3);
            student.setM4(m4);
            student.prucessResult();
            txt_total.setText(Double.toString(student.getTotal()));
            txt_average.setText(Double.toString(student.getAverage()));
            txt_result.setText(student.getResult());
            txt_division.setText(student.getDivision());
            txt_remarks.setText(student.getRemarks());            
        }
        else if(ae.getSource().equals(btn_close)){
            System.exit(0);
        }
        else if(ae.getSource().equals(btn_save)){
            System.out.println("Data Save Sucessfully");
        }
    }
     
    public static void main(String[] args) {
        new Test1();
    }    

>>>>>>> b3d142d092e9a29537fe69fd20771e6c3d6266a1
}
