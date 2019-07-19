/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Broadway
 */
public class Main1 implements ActionListener{
    JFrame frame;
    JLabel lbl_1, lbl_2, lbl_3;
    JTextField txt_id, txt_name, txt_address;
    JButton btn_save, btn_close, btn_search, btn_update, btn_delete;
    
    public Main1(){
        frame=new JFrame();
        frame.setTitle("DBMS Test");
        frame.setSize(250, 350);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        lbl_1=new JLabel();
        lbl_1.setText("ID : ");
        
        lbl_2=new JLabel();
        lbl_2.setText("NAME : ");
       
        lbl_3=new JLabel();
        lbl_3.setText("ADDRESS : ");
        
        txt_id=  new JTextField();
        txt_id.setColumns(20);
        txt_id.setText("<Enter ID>");
        
        txt_name=  new JTextField();
        txt_name.setColumns(20);
        txt_name.setText("<Enter Name>");
        
        txt_address=  new JTextField();
        txt_address.setColumns(20);
        txt_address.setText("<Enter Address>");
        
        btn_save=new JButton();
        btn_save.setText("SAVE");
        btn_save.addActionListener(this);
        
        btn_close=new JButton();
        btn_close.setText("CLOSE");
        btn_close.addActionListener(this);
        
        btn_search=new JButton();
        btn_search.setText("SEARCH");
        btn_search.addActionListener(this);
        
        btn_update=new JButton();
        btn_update.setText("SEARCH");
        btn_update.addActionListener(this);
        
        btn_delete=new JButton();
        btn_delete.setText("SEARCH");
        btn_delete.addActionListener(this);
        
        frame.add(lbl_1);
        frame.add(txt_id);
        frame.add(lbl_2);
        frame.add(txt_name);
        frame.add(lbl_3);
        frame.add(txt_address);
        frame.add(btn_save);
        frame.add(btn_search);
        frame.add(btn_update);
        frame.add(btn_close);
        frame.setVisible(true);
    }
   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(btn_save)){
            int id;
            String name, address;
            id=Integer.parseInt(txt_id.getText());
            name=txt_name.getText();
            address=txt_address.getText();
            new DBInsert(id, name, address);
            System.out.println("SAVE");
            txt_id.setText("<Enter ID>");
            txt_name.setText("<Enter Name>");
            txt_address.setText("<Enter Address>");
        }
        else if(ae.getSource().equals(btn_close)){
            System.out.println("CLOSING");
            System.exit(0);
        }
        else if(ae.getSource().equals(btn_search)){
            System.out.println("SEARCHING");
            int id;
            id=Integer.parseInt(txt_id.getText());
            Person p=new DBSearch().searchPerson(id);
            if(p!=null){
                txt_name.setText(p.getName());
                txt_address.setText(p.getAddress());
                frame.setTitle("Search and display sucessfully");
            }
            else{
                frame.setTitle("Person cannt found");
            }
        }
        else if(ae.getSource().equals(btn_update)){
            int id;
            String name;
            String address;
            id=Integer.parseInt(txt_id.getText());
            name=txt_name.getText();
            address=txt_address.getText();
            Person p=new Person(id, name, address);
            //code
            boolean res= new DBUpdate().updatePerson(p);
            if(res==true){
                frame.setTitle("Record update");
            }
            else{
                frame.setTitle("Error to update");
            }
            System.out.println("UPDATING...");
        }
        else if(ae.getSource().equals(btn_delete)){
            int id1=Integer.parseInt(txt_id.getText());
            boolean res=new DBDelete().deletePerson(id1);
            if(res){
                frame.setTitle("Delete Record");
            }
            else{
                frame.setTitle("Error to delete");
            }
            System.out.println("DELETING.....");
        }
    }
    public static void main(String[] args) {
        new Main1();
    }
    
}
