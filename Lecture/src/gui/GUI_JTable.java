
package gui;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jdbc.DBPerson;
import jdbc.Person;

public class GUI_JTable {
    JFrame frame;
    ArrayList<Person> persons =new ArrayList<Person>();
    JTable tbl_persons;
    DefaultTableModel table_model;
    public GUI_JTable(){
        frame=new JFrame();
        frame.setSize(550, 250);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        tbl_persons=new JTable();
        table_model = new DefaultTableModel();
        
        //getting persons
        DBPerson db=new DBPerson();
        persons=db.allRecords();
//        for(int i=0; i<persons.size(); i++){
//            System.out.println(persons.get(i));
//        }
        Object[] columnsName = new Object[3];
        columnsName[0]="ID";
        columnsName[1]="NAME";
        columnsName[2]="ADDRESS";
        table_model.setColumnIdentifiers(columnsName);
        
        Object[] rowData = new Object[3];
        for(int i = 0; i < persons.size(); i++){
            rowData[0]=persons.get(i).getId();
            rowData[1]=persons.get(i).getName();
            rowData[2]=persons.get(i).getAddress();
            table_model.addRow(rowData);
        }
        tbl_persons.setModel(table_model);
        JScrollPane pane = new JScrollPane(tbl_persons);
        frame.add(pane);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new GUI_JTable();
    }
    
}
