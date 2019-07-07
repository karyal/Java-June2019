/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import oop.Student;

public class Day16_2 {
    public static void main(String []args){
        int n;
        Student s1; //s1 is object of Student Class
        s1=new Student();//initialization of object
        Student s2=new Student();
        s1.id=1;
        s1.name="Your name";
        s1.grade="BIT";
        System.out.println(s1.id+" "+s1.name+" "+s1.grade);
        
    }
}