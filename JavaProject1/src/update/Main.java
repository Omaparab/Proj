package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
		PreparedStatement ps = c.prepareStatement("update student set name =? where roll =?");
		
		ps.setString(1, "Hrushi");
		ps.setInt(2, 12);
		ps.executeUpdate();
		System.out.println("Updated");
		c.close();
	}
}
