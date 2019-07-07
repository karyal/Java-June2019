package oop;
import javax.swing.JFrame;
public class Day18_2 {
    JFrame frame;
    public Day18_2(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 350);
        frame.setResizable(false);
        frame.setTitle("First Window");
        System.out.println(frame.getTitle());
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Day18_2();
    }
}
