package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    String url="jdbc:mysql://localhost:3306/db_training";
    String user="admin";
    String pw="nepal123";
    
    public DBConnect(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");//load driver
            Connection conn=DriverManager.getConnection(url, user, pw);
            System.out.println("Connect database sucessfully");
            //Inser, Update, Delete, Or Select
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
