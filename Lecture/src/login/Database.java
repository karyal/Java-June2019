/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    static String url="jdbc:mysql://localhost:3306/test";
    static String user="root";
    static String pw="";
    static Connection conn=null;
    public static Connection connect(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");//load driver
            conn=DriverManager.getConnection(url, user, pw);
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
        return(conn);
    }
    public static void close(Connection conn){
        try{
            conn.close();
        }
        catch(Exception ex){
            System.out.println("Error : "+ex);
        }
    }
}
