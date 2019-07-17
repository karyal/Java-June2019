package oop;

public class Marks {
    int id;
    int mark1;
    int mark2;
    
    public Marks(){
        this.id=0;
        this.mark1=0;
        this.mark2=0;
    }
    public Marks(int id, int mark1, int mark2){
        this.id=id;
        this.mark1=mark1;
        this.mark2=mark2;
    }
    public String toString(){
        return(this.id +" "+this.mark1+" "+this.mark2);
    }
}
