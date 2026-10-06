import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DBconn{
	public static void main(String[] args){
		String url = "jdbc:mysql://localhost:3306/mysql";
		String user = "root";
		String password = "root";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
				
			Statement stmt = conn.createStatement();


			String sql = "CREATE TABLE IF NOT EXISTS book("
					+"id INT PRIMARY KEY, "
					+"name VARCHAR(40)"
					+")";
			
			String s = "INSERT INTO book(id, name) VALUES(?,?)";

			PreparedStatement pstmt = conn.prepareStatement(s);

			pstmt.setInt(1,101);
			pstmt.setString(2,"Sakshi");

			pstmt.setInt(1,102);
			pstmt.setString(2,"Shravani");

			pstmt.setInt(1,103);
			pstmt.setString(2,"oracle");

			String up = "UPDATE book SET name='3Idiots' where id=?";
			pstmt = conn.prepareStatement(up);

			pstmt.setInt(1,102);
			
			int ro = pstmt.executeUpdate();
			System.out.println(ro);

			String del = "DELETE FROM book where id=103";
			pstmt = conn.prepareStatement(del);

			ResultSet rs = pstmt.executeQuery("SELECT * FROM book");

			

			while(rs.next()){
				System.out.println("User Id = "+ rs.getInt("id"));
				System.out.println("User Name = " + rs.getString("name"));
			}

			
			
			int row = pstmt.executeUpdate();
			System.out.println(row);

			
			rs.close();
			pstmt.close();						 						
			conn.close();
	
		}catch(Exception e){
			e.printStackTrace();

		}
	}
}