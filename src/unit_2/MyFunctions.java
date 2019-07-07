package unit_2;

public class MyFunctions {
   public static void printHello(){
       System.out.println("Hello world of java");
   } 
   public static void printMessage(String msg){
       System.out.println(msg);
   }
   public static int getNumber(){
       int n=0;
       n=(int)Math.random()*10+1;
       return(n);
   }
   
   public static int doAdd(int n1, int n2){
       int n3=n1+n2;
       return(n3);
   }
   
}
