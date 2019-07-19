/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

public class Person {
    int id;
    String name;
    String address;

    public Person() {
        this.id = 0;
        this.name = "";
        this.address = "";
    }
    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Person(Person p) {
        this.id = p.id;
        this.name = p.name;
        this.address = p.address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }
}
