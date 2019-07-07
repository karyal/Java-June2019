package oop;

public class Person {
    int id;
    String name;
    String address; 
    
    //Default Constructor
    public Person(){
        this.id=0;
        this.name="";
        this.address="";
    }
    
    //Parameterized constructor //Method overloading
    public Person(int id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    //copy constructor
    public Person(Person p){
        this.id=p.id;
        this.name=p.name;
        this.address=p.address;
    }
    //Setters
    public void setID(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    //Getters
    public int getID(){
        return(this.id);
    }
    public String getName(){
        return(this.name.toUpperCase());
    }
    public String getAddress(){
        return(this.address.toUpperCase());
    }
    
    @Override
    public String toString(){
        return(this.id + " "+ this.name+ " "+ this.address);
    }
}
