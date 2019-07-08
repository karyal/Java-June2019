package gui;
import javax.swing.JFrame;

public class Day19_1 {
    JFrame frame;
    public Day19_1(){
        frame =new JFrame();
        frame.setSize(350, 350);
        frame.setResizable(false);
        frame.setTitle("My first window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
