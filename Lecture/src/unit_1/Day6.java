package unit_1;

import java.util.Scanner;

public class Day6 {
    public static void main(String []args){
        /*
        byte bn=20;
        short sn=bn;
        double dn=sn;
        System.out.println(dn);
        
        dn=1234567.56655;
        sn=(short)dn;
        bn=(byte)sn;
        System.out.println(bn);
        
        int n=10;
        Integer obj_in=new Integer(n);//stores value of n
        System.out.println(obj_in);
        
        String str="200";
        //int n2=str;
        int n2=Integer.parseInt(str);//String to integer
        System.out.println(n2);
        
        //Operators
        //=, =...=, +=
        */
        //IO - Input/Output
        
        //Declare
        int num1, num2, num3;
        
        //Input
        //Prompt for user - message
        System.out.print("Enter first number : ");
        num1=new Scanner(System.in).nextInt();
        System.out.print("Enter second number : ");
        num2=new Scanner(System.in).nextInt();
        
        //Process
        num3=num1+num2;
        
        //Output
        System.out.println("Result : "+num3);
        
        
    }
}
