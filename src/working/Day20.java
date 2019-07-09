package working;
import oop.NewStudent;
import oop.FinalStudent;
public class Day20 {
    public static void main(String[] args) {
        /*
        NewStudent s1=new NewStudent(1,"Name1");
        FinalStudent fs=new FinalStudent("BIT","A");
        
        System.out.println(s1);
        System.out.println(fs);
        
        
        s1.setID(2);
        s1.setName("Krishna");
        System.out.println(s1);
        
        //s1.id=10;
        //s1.name="Krishna Aryal";
        //System.out.println(s1);
        */
        FinalStudent fs=new FinalStudent(1,"Name","Grade","Section");
        System.out.println(fs);
    }
}
