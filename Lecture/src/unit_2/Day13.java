package unit_2;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        /*
        int start=1;// read from keyboard
        int stop=10;//read from keyboard        
        for(; ; ){
            if(start<=stop){
                System.out.println("Hello");
                start++;
            }            
            else{
                break;//out of current loop
            }
        }
                
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
        
        for(int j=10; j<=15; j++){
            System.out.println(j);
        }
        
        
        for(int i=1; i<=5; i++){
            System.out.println(i);
            
            for(int j=10; j<=15; j++){
                System.out.println(j);
            }
        } 
        
        for(int i=1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
            
        }
        
        int n;//variable
        int []nums=new int[5];//declare
        nums[0]=10;
        nums[1]=87;
        nums[2]=90;
        nums[3]=9;
        nums[4]=87;        
        nums[0]=9;//Replace update
        nums[0]=100;//replace
        nums[-1]=90;
        //String array
        final int MAX=3;
        String students[]=new String[MAX];
        /*
        students[0]="Dipesh";
        students[1]="Krishna";
        students[2]="Ashik";
        
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        
        //input
        for(int i=0; i<MAX;i++){
            System.out.print("Enter name "+(i+1)+" : ");
            students[i]=new Scanner(System.in).nextLine();
        }
        //process
        for(int i=0; i<MAX; i++){
            students[i]=students[i].toUpperCase();
        }
        //output
        for(int i=0; i<MAX; i++){
            System.out.println(students[i]);
        }        
        */
        //declare
        final int MAX=3;
        final int PM=40;
        double marks[]=new double[MAX];
        double total=0, average=0;
        
        //input read marks from user
        for(int i=0; i<MAX; i++){
            System.out.print("Enter mark "+(i+1)+" : ");
            marks[i]=new Scanner(System.in).nextDouble();
        }
        //process
        //calculate total
        for(int i=0; i<MAX;i++){
            total=total+marks[i];
        }
        average=total/MAX;
        
        //output
        for(int i=0; i<MAX; i++){
            System.out.println("Mark "+(i+1)+" : "+marks[i]);
        }
        System.out.println("Total : "+total);
        System.out.println("Average : "+average);                
        //HW calculate and print result and division
        
    }
}