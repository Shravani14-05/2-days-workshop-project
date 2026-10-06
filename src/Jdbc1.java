import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class Jdbc1{
    public static void main(String[]args){
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String pass = "root";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);
            System.out.println("connection successfully");
            conn.close();

        
    }
    catch(Exception e){
        // System.out.println("no connection");
        e.printStackTrace();
    }
}
}