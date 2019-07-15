package oop;

public class NewStudent {
    //Properties
    private int id;
    private String name;
    
    //Constructors
    public NewStudent(){
        this.id=0;
        this.name="";
    }
    public NewStudent(int id, String name){
        this.id=id;
        this.name=name;
    }
    public NewStudent(NewStudent ns){
        this.id=ns.id;
        this.name=ns.name;
    }
    //Getters
    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    } 
    //Setters
    public void setID(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return(this.id +" "+this.name);
    }
}