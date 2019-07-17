
package interface_test;

public class Test implements Inf1, Inf2{
    @Override
    public void f1(){
        System.out.println("Hello from f1()");
    }
    @Override
    public void f2(){
        System.out.println("Hello from f2()");
    }
    public static void main(String[] args) {
        System.out.println(Inf1.MAX);
        System.out.println(Inf2.MAX);
        new Test().f1();
        new Test().f2();
        Test test=new Test();
        test.f1();
        test.f2();
        
        Inf1 obj1;
        Inf2 obj2;
        obj1=new Test1();
        obj2=new Test1();
        obj1.f1();
        obj2.f2();
        
    }
}
