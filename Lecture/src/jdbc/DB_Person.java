/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import gui.Person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB_Person {
    String url="jdbc:mysql://localhost/test";
    String user="root";
    String pw="";
    public boolean saveRecord(Person p){
        boolean res=false;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            
            //insert into tbl_person(id, name, adress) values(1,'Name1','Address1');
            /*
            int id;
            String gender;
            int reading;
            int playing;
            String age_group;
            String address;
            */
            String sql="insert into tbl_person(id,gender,reading,playing,age_group,address) values(?, ?, ?, ?, ?, ?);";
            //Inser, Update, Delete, Or Select
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.setInt(1, p.getId());
            pstat.setString(2, p.getGender());
            pstat.setInt(3, p.getReading());
            pstat.setInt(4, p.getPlaying());
            pstat.setString(5, p.getAge_group());
            pstat.setString(6, p.getAddress());
            pstat.executeUpdate(); //insert, update, delete
            System.out.println("Insert record sucessfully");
            conn.close();
            res=true;
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
        return(res);
    } 
    
    public Person searchRecord(int id){
        Person p=new Person();
        try{
            Class.forName("org.gjt.mm.mysql.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            /*
            int id; String gender; int reading; int playing; String age_group; String address;
            */
            String sql="select * from tbl_person WHERE id=?";
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.setInt(1, id);
            ResultSet rs = pstat.executeQuery();
            while(rs.next()){
                p.setId(rs.getInt(1));
                p.setGender(rs.getString(2));
                p.setReading(rs.getInt(3));
                p.setPlaying(rs.getInt(4));
                p.setAge_group(rs.getString(5));
                p.setAddress(rs.getString(6));
            }
            conn.close();
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
        return(p);
    } 
}
