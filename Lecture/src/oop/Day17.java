package oop;

public class Day17 {
   public static void main(String []args){
       /*
       Person p=new Person();
       Person p1;
       p.id=1;
       p.name="Name1";
       p.address="Address";
       System.out.println(p.id+" "+p.name+" "+p.address);
       p1=p;//Reference Type
       System.out.println(p1.id+" "+p1.name+" "+p1.address);
       p1.id=2;
       p1.name="Name2";
       p1.address="Address2";
       System.out.println(p.id+" "+p.name+" "+p.address);
       
       p1=new Person();//Initialize (Allocate and set default)
       System.out.println(p1.id+" "+p1.name+" "+p1.address);
       p1.id=3;
       p1.name="Name3";
       p1.address="Address3";
       System.out.println(p1.id+" "+p1.name+" "+p1.address);
       */
       
       Person p1=new Person();
       Person p2=new Person();//Default value initialize
       Person p3=new Person(1, "Ashik", "Baniyatar");
       
       System.out.println(p1.id+" "+p1.name+" "+p1.address);
       System.out.println(p2.id+" "+p2.name+" "+p2.address);
       System.out.println(p3.id+" "+p3.name+" "+p3.address);
       p1.id=2;
       p1.name="New Name";
       p1.address="New Address";
       System.out.println(p1.id+" "+p1.name+" "+p1.address);
       
       Marks m1, m2;
       m1=new Marks();
       m2=new Marks(1, 56, 43);
       m1.id=2;
       m1.mark1=89;
       m1.mark2=100;
       
       System.out.println(m1);
       System.out.println(m2);
       
       
       
       
   } 
}
