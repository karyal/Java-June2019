
package oop;

import java.util.Scanner;

public class Day18_3 {
 
    public static void main(String[] args) {
        /*
        Student s1, s2, s3;
        s1=new Student();
        s2=new Student(1,"Name","Grade",34,43);
        s3=new Student(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        s3.calculateTotal();
        s3.calculateAverage();
        s3.calculateResult();
        System.out.println(s3);
        */
        int id, m1, m2;
        String name, grade;
        Student s1;
        
        System.out.print("Enter id : ");
        id=new Scanner(System.in).nextInt();
        System.out.print("Enter name : ");
        name=new Scanner(System.in).nextLine();
        System.out.print("Enter grade : ");
        grade=new Scanner(System.in).nextLine();
        System.out.print("Enter marks1 : ");
        m1=new Scanner(System.in).nextInt();
        System.out.print("Enter marks2 : ");
        m2=new Scanner(System.in).nextInt();
        s1=new Student(id, name, grade, m1, m2);
        
        s1.calculateTotal();
        s1.calculateAverage();
        s1.calculateResult();
        System.out.println(s1);
        
    }
    
}
