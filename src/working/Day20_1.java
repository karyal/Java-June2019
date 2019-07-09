
package working;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
public class Day20_1 extends JFrame{
    JLabel lbl_1;
    public Day20_1(){
        setSize(250, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Second window");
        setLayout(new FlowLayout());
        lbl_1=new JLabel();
        lbl_1.setText("Enter first no :");
        add(lbl_1);
        setVisible(true);
    }
    public static void main(String []args){
        new Day20_1();
    }
}