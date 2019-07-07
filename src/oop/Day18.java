/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

public class Day18 {

    public static void main(String[] args) {
        Person p1=new Person();//Default Ctor
        Person p2=new Person(1, "Name", "Address");//Param Ctor
        Person p3=new Person(p2);//Copy Ctor
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        p2.setID(10);
        System.out.println(p2);//all values
        
        System.out.println(p2.getID());
        System.out.println(p2.getName());
        System.out.println(p2.getAddress());
        
        
    }
    
}
