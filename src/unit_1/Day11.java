package unit_1;

import java.util.Scanner;

public class Day11 {
    public static void main(String []args){
        int n1, n2, n3, large;
        System.out.println("Enter number : ");
        n1= new Scanner(System.in).nextInt();        
        System.out.println("Enter number : ");
        n2= new Scanner(System.in).nextInt();        
        System.out.println("Enter number : ");
        n3= new Scanner(System.in).nextInt();        
        large=n1;
        if(n2>large){
            if(n2>n3){
                large=n2;
            }
        }
        if(n3>large)
            if(n3>n2)
                large=n3;
        
        System.out.println("Large : "+large);
    
    
    
    char ch;
    System.out.print("Enter any character : ");
    ch=new Scanner(System.in).nextLine().charAt(0);
    switch(ch){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("Vowel");
            break;
        default:
            System.out.println("Other");
    }
            
            




















    }
}
