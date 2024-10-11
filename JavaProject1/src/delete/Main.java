package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
		PreparedStatement ps = c.prepareStatement("delete from student where roll = ?");
		
		ps.setInt(1, 13);
		ps.executeUpdate();
		System.out.println("Deleted");
		c.close();
	}
}

