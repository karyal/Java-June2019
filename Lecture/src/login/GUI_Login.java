/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI_Login implements ActionListener{
    JFrame frame;
    JTextField txt_login_name;
    JTextField txt_login_password;
    JButton btn_login;
    JButton btn_close;
    JLabel lbl_message;
    
    public GUI_Login(){
        frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setTitle("Main window");
        frame.setSize(350, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        txt_login_name=new JTextField(20);
        txt_login_password=new JTextField(20);
        
        btn_login=new JButton("Login");
        btn_login.addActionListener(this);
        btn_close=new JButton("Close");
        btn_close.addActionListener(this);
        
        lbl_message=new JLabel();
        
        frame.add(new JLabel("Login name : "));
        frame.add(txt_login_name);
        frame.add(new JLabel("Login password : "));
        frame.add(txt_login_password);
        frame.add(btn_login);
        frame.add(btn_close);
        frame.add(lbl_message);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
       new GUI_Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_close){
            //process to exits
            System.exit(0);
        }
        else if(e.getSource()==btn_login){
            //process to login
            lbl_message.setText("Login.......");
            String tmp_name=txt_login_name.getText();
            String tmp_password=txt_login_password.getText();
            Login login=new Login(tmp_name, tmp_password);
            
        }
    }
}
