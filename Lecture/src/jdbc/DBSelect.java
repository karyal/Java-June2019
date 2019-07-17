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

public class DBSelect {
    String url="jdbc:mysql://192.168.103.126:3306/db_training";
    String user="admin";
    String pw="admin123";
    
    public DBSelect(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            System.out.println("Connect database sucessfully");
            //insert into tbl_person(id, name, adress) values(1,'Name1','Address1');
            String sql="SELECT * FROM `tbl_person`";
            //Inser, Update, Delete, Or Select
            PreparedStatement pstat=conn.prepareStatement(sql);
            ResultSet rs=pstat.executeQuery(); //select
            System.out.println("ID\tNAME\t\tADDRESS");
            while(rs.next()==true){//if record in rs
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3));
            }
            System.out.println("Select and display record(s) sucessfully");
            conn.close();
            System.out.println("Database connection closed sucessfully");
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
    }
    public static void main(String[] args) {
        new DBSelect();
    }
}