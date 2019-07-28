
package gui;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import jdbc.DBPerson;
import jdbc.Person;

public class GUI_JTable {
    JFrame frame;
    ArrayList<Person> persons =new ArrayList<Person>();
    
    public GUI_JTable(){
        frame=new JFrame();
        frame.setSize(550, 250);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        //getting persons
        DBPerson db=new DBPerson();
        persons=db.allRecords();
        for(int i=0; i<persons.size(); i++){
            System.out.println(persons.get(i));
        }
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new GUI_JTable();
    }
    
}
