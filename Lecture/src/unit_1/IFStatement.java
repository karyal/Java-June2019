/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_1;

public class IFStatement {
    public enum Result{PASS, FAIL};
    
    public static void main(String[] args) {
        int sub1=45;
        Result result = Result.FAIL;
        if(sub1>=Global.PM){
            result=Result.PASS;
        }
        System.out.println("Result : "+result);
               
    }
    
}
