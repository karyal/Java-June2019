
package unit_1;
import java.util.Scanner;//library import
public class IOTest {
    public static void main(String []args){
        String str1;
        char ch;
        System.out.print("Enter string : ");
        ch=new Scanner(System.in).nextLine().charAt(0);
        System.out.println("String is : "+ch);
    }
}
