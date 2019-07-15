
package oop;

public class Day_16 {
    public static void main(String[] args) {
        /*
        String str1="Kathmandu, Nepal";//declare and initialize
        int len=str1.length();
        System.out.println(len);//16
        char ch=str1.charAt(0);//K
        System.out.println(ch);
        
        for(int i=0; i<str1.length(); i++){
            System.out.print(str1.charAt(i));
        }
        System.out.println();
        
        for(int i=str1.length()-1; i>=0; i--){
            System.out.print(str1.charAt(i));
        }
        System.out.println();
        */
        //compareTo()
        String str1="Kathmandu";
        String str2="kathmandu";
        int res=str1.compareTo(str2);
        System.out.println(res);
        //Enter user name : _
        //Enter password : _
        
        //if username equals to admin and 
        //password equals nepal123 than print "Welcome to system"
        //else print "Error: user name or password"
        
        char ch='a', ch1='A';
        System.out.println(ch);
        int n=ch-ch1;
        System.out.println(n);
        
        //print ascii value with character
        for(int i=0; i<=256;i++){
            char ch2=(char)i;
            System.out.println(i+" = "+ch2);
        }
        
    }
}
