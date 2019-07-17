
package unit_1;
import java.util.Scanner;
public class Day8 {
    public static void main(String []args){
        /*
        double rn=Math.random();//0-0.99
        System.out.println(rn*100);
        
        boolean res;
        res=true;
        res=false;
        //Relational operators
        //  == equals
        // boolean
        // char
        // numeric
        //         value1 == value2
        byte b1, b2;
        b1=20;
        b2=21;
        res = (b1==b2);
        System.out.println(res);
        
        char ch1, ch2;
        ch1='A';
        ch2='B';
        res = (ch1==ch2);
        System.out.println(res);
        
        boolean r1, r2;
        r1=false;
        r2=false;
        res  = (r1==r2);
        System.out.println(res);
        
        String str1, str2;
        str1="Kathmandu";
        str2="Kathmandu";
        //res = (str1==str2);
        res = str1.equals(str2); //String and Object //password
        res = str1.equalsIgnoreCase(str2); //USer name
        System.out.println(res);
        
        //b. Not Equals to (!=)
        
        byte b1=19, b2=90;
        boolean res;
        res = (b1 != b2);
        System.out.println(res);
        
        // c. > Greater than 
        short s1, s2;
        boolean res;
        s1=90;
        s2=8;
        res = (s1>s2);
        System.out.println(res);
        res = (s2>s1);
        System.out.println(res);
                
        
        //d. < Less than
        int n1, n2;
        boolean res;
        n1=89;
        n2=32;
        res = (n1<n2);
        System.out.println(res);
        res = (n2<n1);
        System.out.println(res);
        
        //e. >= Greater than or equals to
        //f. <= Less than or equals to
        
        //5. Not operator (!)
        boolean res=true;
        System.out.println(res);
        System.out.println(!(!res));
        
        
        //6. Conditional Operator 
        // (Condition)?Result1:Result2
        //Condition -> (Value1 Relational Operator Value2) -> Boolean
        
        long n1, n2, n3;
        n1=34;
        n2=100;
        n3 = (n1>n2)?n1:n2;
        System.out.println(n3);
        */
        
        //Declare
        int n1, n2;
        boolean r1, r2, r3, r4, r5, r6;
        //input
        System.out.print("Enter first no : ");
        n1=new Scanner(System.in).nextInt();
        System.out.print("Enter second no : ");
        n2=new Scanner(System.in).nextInt();
        //process
        r1=(n1==n2);
        r2=(n1!=n2);
        r3=(n1>n2);
        r4=(n1>=n2);
        r5=(n1<n2);
        r6=(n1<=n2);
        //output
        System.out.println("==\t:\t"+r1);
        
        
        
        
        
        
        
        
        
        
        
    }
}
