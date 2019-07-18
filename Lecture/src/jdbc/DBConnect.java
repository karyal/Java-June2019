package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnect {
    String url="jdbc:mysql://192.168.103.126:3306/db_training";
    String user="admin";
    String pw="admin123";
    
    public DBConnect(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            System.out.println("Connect database sucessfully");
            conn.close();
            System.out.println("Database connection closed sucessfully");
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
    }
    public static void main(String[] args) {
        new DBConnect();
    }
}