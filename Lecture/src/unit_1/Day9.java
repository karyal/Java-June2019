/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_1;

public class Day9 {
    public static void main(String []args){
        int num1, num2, num3;
        int res1, res2;
        int res4, res5;
        num1=20;
        num2=32;
        num3=21;
        res1=(num1>=num2)?num1:num2;
        res2=(res1>=num3)?res1:num3;
        System.out.println(res2);
    }
}
