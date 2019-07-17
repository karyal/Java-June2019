package exceptions;
//import java.io.File;
import javax.swing.JFrame;

public class Test1 {
    public static void main(String[] args) {
        //declare
        int n1, n2, n3;
        JFrame frame=null;
        try{ 
            frame=new JFrame();
            n1=9;
            n2=3;
            n3=n1/n2;
            System.out.println(n3);
            frame.setTitle("First Window");
            //input, process, output
        }
        catch(ArithmeticException ex){
            //print error message if any problems during (i, p, o)
            System.out.println("Error1 : "+ex);
        }
        catch(NullPointerException ex){
            System.out.println("Error2 : "+ex);
        }
        catch(Exception ex){
            System.out.println("Error3 : "+ex);
        }
        finally{
            System.out.println("Hello from finally");
        }
    }
}
