/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class DBPerson {
    String url="jdbc:mysql://localhost/test";
    String user="root";
    String pw="";
    public ArrayList<Person> allRecords(){
        ArrayList<Person> persons=new ArrayList<Person>();
        try{
            Class.forName("org.gjt.mm.mysql.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            String sql="select * from person";
            PreparedStatement pstat=conn.prepareStatement(sql);
            ResultSet rs = pstat.executeQuery();
            while(rs.next()){
                Person tmp=new Person();
                tmp.setId(rs.getInt(1));
                tmp.setName(rs.getString(2));
                tmp.setAddress(rs.getString(3));
                persons.add(tmp);
            }
            conn.close();
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
        return(persons);
    } 
}
