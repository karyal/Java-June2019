package unit_2;

import java.util.Scanner;

public class Day14_3 {
    public static void main(String[] args) {
        //declare 1D array with for 5 elements
        int nums[]=new int [5];
        int total=0, average=0;
        //accept inputs for all elements using for loop
        for(int i=0; i<nums.length; i++){
            nums[i]=new Scanner(System.in).nextInt();
        }
        //calculate total of elements using loop
        for(int i=0; i<nums.length; i++){
            total+=nums[i];//total=total+nums[i];
        }
        //calculate average value
        average=total/nums.length;
        //print all elements of array
        //print total of elements
        //print average of elements
        
        //home work
        //find and display largest value 
        //find and display smallest value
    }   
}