
package unit_2;

public class Day14 {
    
    static final int MAX =5;
    public static void main(String[] args) {
        int nums[];//Declare
        nums=new int [MAX]; //initialize
        
        //int nums[]=new int[MAX]; //declare and initialize
        //nums[0]=10;
        //...
        //nums[4]=89;
        //nums[5]=100; //Error: Array Index out of bounds
        int n=nums.length;// returns size of array
        System.out.println(n);
        
        int marks[]={34, 56, 76, 32, 10};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        //System.out.println(marks[5]);
        int n1=marks[4];
        System.out.println(n1);
        
        //loop which print 0 to 5
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
