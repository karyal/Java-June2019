
package exceptions;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        int age=0;
        try{
            System.out.println("Enter age (20-30) : ");
            age=new Scanner(System.in).nextInt();
            if((age<20) || (age>30))
                throw new AgeException("Please enter age 20-30");//validation
            System.out.println("AGE : "+age);
        }
        catch(Exception ex){
            System.out.println("Error1 : "+ex);
        }
    }
    
}
