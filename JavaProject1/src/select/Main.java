package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
		
		ResultSet rs = c.prepareStatement("select * from student").executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
		}
		
		c.close();
	}
}
