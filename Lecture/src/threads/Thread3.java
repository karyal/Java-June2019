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
public class Thread3 extends Thread{
    String name;
    int start;
    int stop;
    int interval;//ms
    
    public Thread3(String name, int start, int stop, int interval){
        this.name=name;
        this.start=start;
        this.stop=stop;
        this.interval=interval;
    }
    
    @Override
    public void run(){
        try{
            for(; start<=stop; start++){
                System.out.println(name+" : "+start);
                Thread.sleep(interval);
            }
        }
        catch(Exception ex){
            System.out.println("Error "+ex);
        }
    }
}
