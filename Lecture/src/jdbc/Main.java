/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.util.Scanner;

/**
 *
 * @author Broadway
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice=0;
        do{
            System.out.println("1. ADD NEW");
            System.out.println("2. SEARCH");
            System.out.println("3. DISPLAY ALL");
            System.out.println("4. UPDATE");
            System.out.println("5. DELETE");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice (0->Exit) : ");
            choice=new Scanner(System.in).nextInt();
            if(choice>=1 && choice<=5){
                switch(choice){
                    case 1:
                        new DBInsert();
                        break;
                    case 2:
                        new DBSearch();
                        break;
                    case 3:
                        new DBSelect();
                        break;
                    case 4:
                        new DBUpdate();
                        break;
                    case 5:
                        new DBDelete();
                        break;
                }
            }
        }while(choice!=0);
    }
    
}
