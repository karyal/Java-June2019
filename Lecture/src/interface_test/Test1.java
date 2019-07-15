
package interface_test;

public class Test1 implements Inf1, Inf2{
    @Override
    public void f1() {
        System.out.println(Inf1.MAX);
    }

    @Override
    public void f2() {
        System.out.println(Inf2.MAX);
    }
}
