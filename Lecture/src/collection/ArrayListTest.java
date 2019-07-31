package collection;
import java.util.ArrayList;

public class ArrayListTest {
    
    public static void main(String[] args) {
        int MAX = 5;
        int nums[]=new int [MAX];
        nums[0]=34;
        nums[1]=46;
        nums[2]=87;
        nums[3]=78;
        nums[4]=98;
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("");
        
        //ArrayList
        ArrayList arrList =new ArrayList();
        ArrayList arrList2 =new ArrayList();
        ArrayList arrList3 =new ArrayList();
        
        System.out.println(arrList.size());
        arrList.add(90);
        arrList.add(32);
        arrList.add(75);
        printValues(arrList);
        arrList.add(1, 100);
        printValues(arrList);
        arrList.add(0, 78);
        printValues(arrList);
        arrList.set(2, 34);
        printValues(arrList);
        //arrList.remove(90);//Value
        //printValues(arrList);
        arrList.remove(0);//Index
        printValues(arrList);
        //arrList.clear();
        arrList2 = arrList; //Reference Copy
        printValues(arrList2);
        arrList2.set(0, 85);
        printValues(arrList);
        printValues(arrList2);
        arrList2.add(91);
        printValues(arrList);
        
        arrList3 =(ArrayList) arrList.clone();//Copy by Value
        printValues(arrList3);
        arrList3.set(0, 99);
        printValues(arrList3);
        printValues(arrList2);
        printValues(arrList);
        
        //
        ArrayList arrList4 = new ArrayList();
        arrList4.add(true);
        arrList4.add(1);
        arrList4.add('A');
        arrList4.add("Kathmandu");
        printValues(arrList4);
        
        //
        ArrayList arrList5 = new ArrayList();
        arrList5.add(new Person(1,"Name1"));
        arrList5.add(new Student("BIT","A"));
        printValues(arrList5);
        Person p=new Person(2,"Raj");
        arrList5.set(0, p);        
        printValues(arrList5);        
        printValues1(arrList5);
    }
    
    public static void printValues(ArrayList list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
    }
    public static void printValues1(ArrayList list){
        for(int i=0;i<list.size();i++){
            Object obj = list.get(i);
            if((Person) obj instanceof Person){
                Person p=(Person)obj;
                p.printPerson();
            }
            else if((Student) obj instanceof Student){
                Student s=(Student)obj;
                s.printStudent();
            }            
            //System.out.println(res);
        }
    }
}
