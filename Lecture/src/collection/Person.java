/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author Broadway
 */
public class Person {
    int id;
    String name;
    
    public Person() {
        this.id = 0;
        this.name = "";
    }
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + '}';
    }    
    
    public void printPerson() {
        System.out.println("Person{" + "id=" + id + ", name=" + name + '}');
    } 
}