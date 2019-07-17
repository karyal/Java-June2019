package oop;
//Access Specifiers
public class Class1{
    int a;//default //inside of current package
    public int b;//public //all the classes (inside or outside package)
    protected int c;//protected //sub classes
    private int d;//private   //by only this class
    
    public void f1(String str){
        System.out.println(str);
    }
    public void f1(int n1){
        System.out.println(n1);
    }
    public void f1(double n1){
        System.out.println(n1);
    }
    
    
}