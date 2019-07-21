/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Broadway
 */
public class Test {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.start();
        
        Thread2 t2=new Thread2("Hello");
        t2.start();
        
        Thread3 t3, t4;
        t3=new Thread3("First", 1, 200, 1000);
        t4=new Thread3("Second",201, 400, 500);
        t3.start();
        t4.start();
        
    }
}
