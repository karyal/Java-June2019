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
}
