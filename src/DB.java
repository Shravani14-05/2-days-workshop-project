import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
 public class DB{
    public static void main(String[]args){
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "root";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,password);
            System.out.println("connected successfully");
            conn.close();
            Statement stmt= conn.createStatement();
            String sql="create table"
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

 }