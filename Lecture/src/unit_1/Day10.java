/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_1;
import java.util.Scanner;
public class Day10 {
    public static void main(String []args){
        int n=0;
        System.out.println("Enter number : ");
        n=new Scanner(System.in).nextInt();//-1
        if(n==0){
            System.out.println("Zero");
        }
        if(n==1){
            System.out.println("One");
        }
        if(n==2){
            System.out.println("Two");
        }
        System.out.println("End");
    }
}
