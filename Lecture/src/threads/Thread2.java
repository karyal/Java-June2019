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
public class Thread2 extends Thread{
    String msg;
    public Thread2(String str){
        this.msg=str;
    }
    @Override
    public void run(){
        System.out.println(this.msg);
    }
}
