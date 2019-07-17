
package unit_2;

import java.util.Scanner;

public class Day16_Task1 {
    public static final String UN="Admin";
    public static final String PW="nepal123";
    public static void main(String[] args) {
        String user_name, user_password;
        System.out.print("Enter user name : ");
        user_name=new Scanner(System.in).nextLine();
        System.out.print("Enter password : ");
        user_password=new Scanner(System.in).nextLine();
        int res1=user_name.compareToIgnoreCase(UN);
        int res2=user_password.compareTo(PW);
        if(res1==0 && res2==0){
            System.out.println("Welcome to system");
        }
        else{
            System.out.println("Error user name or password");
        }
    }
    
}
