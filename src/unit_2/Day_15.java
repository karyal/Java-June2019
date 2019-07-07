
package unit_2;
import java.lang.Math;
import java.util.Date;

public class Day_15 {

    public static void main(String[] args) {
        MyFunctions.printHello();
        MyFunctions.printHello();
        MyFunctions.printMessage("Hello from Krishna");
        int res=MyFunctions.getNumber();
        MyFunctions.printMessage("Number : "+res);
        int res1=MyFunctions.doAdd(23, 33);
        MyFunctions.printMessage("Result : "+res1);
        
        double dn1=Math.abs(-123.45);
        System.out.println(dn1);
        
        String dt=new Date().toString();
        System.out.println(dt);
        
    }
    
}
