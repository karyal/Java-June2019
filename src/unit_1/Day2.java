/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_1;

public class Day2 {
    public static void main(String []args){
        //Basic Data Types
        //Declare
        boolean b;
        byte bn;
        char ch;
        short sh;
        int in;
        long ln;
        float fn;
        double dn;
        String str;
        Object obj;
       //Input
        b=true;
        bn=8;
        ch='A';
        sh=345;
        in=4567;
        ln=888989;
        fn=234.56F;
        dn=390509385.43646;
        str="Kathmandu";
        obj=b;//in
        //output
        System.out.println("Boolean = "+b);
        
        //Object type
        int num1;//basic type
        Integer obj_int;//object type
        num1=30;//assign
        obj_int=new Integer(num1);//initialize
        System.out.println(num1);//access
        System.out.println(obj_int);//access
        obj_int=345;//direct value assign
        System.out.println(obj_int);//access
        
        //Type Conversion
        String str2="123";
        int num2=Integer.parseInt(str2);//String to int
        System.out.println(num2);
        String str3=Integer.toString(num2); //int to String
        
        //Type cast 
        //byte -> short -> int -> long -> float -> double
        byte bn1=127;
        short sh1=bn1;
        double dn1=sh1;
        System.out.println(dn1);
        
        dn1=234.525255;
        sh1=(short)dn1;//cast //downgrade
        bn1=(byte)sh1;
        System.out.println(bn1);
        
        //IO
        
        
        
        
    }
}
