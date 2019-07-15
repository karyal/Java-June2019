package gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Comment.
public class Day19_1 implements ActionListener {
    JFrame frame;
    JLabel lbl_1, lbl_2, lbl_3;
    JTextField txt_1, txt_2, txt_3;
    JButton btn_add, btn_close;
    
    public Day19_1(){
        frame =new JFrame();
        frame.setSize(250, 180);
        frame.setResizable(false);
        frame.setTitle("My first window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lbl_1=new JLabel();
        lbl_1.setText("First No :");
        
        lbl_2=new JLabel();
        lbl_2.setText("Second No :");
        
        lbl_3=new JLabel();
        lbl_3.setText("Result : ");
        
        txt_1=new JTextField();
        txt_1.setColumns(10);
        
        txt_2=new JTextField();
        txt_2.setColumns(10);
        
        txt_3=new JTextField();
        txt_3.setColumns(10);
        
        btn_add=new JButton();
        btn_add.setText("ADD");
        btn_add.addActionListener(this);
        
        btn_close=new JButton();
        btn_close.setText("CLOSE");
        btn_close.addActionListener(this);
        
        frame.setLayout(new FlowLayout());
        frame.add(lbl_1);
        frame.add(txt_1);
        frame.add(lbl_2);
        frame.add(txt_2);
        frame.add(btn_add);
        frame.add(btn_close);
        frame.add(lbl_3);
        frame.add(txt_3);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(btn_add)){
            System.out.println("You clicked on ADD Button");
            
            double num1, num2, num3;
            num1=Double.parseDouble(txt_1.getText());
            num2=Double.parseDouble(txt_2.getText());
            num3=num1+num2;
            System.out.println("Result : "+num3);
            txt_3.setText(Double.toString(num3));
        }
        else if (ae.getSource().equals(btn_close)){
            System.out.println("you clicked on CLOSE Button");
            System.exit(0);
        }
    }
}