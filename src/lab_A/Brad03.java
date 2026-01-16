package lab_A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad03 {
	private static final String URL = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String SQL_INSERT = """
			INSERT INTO cust
			(cname, tel, birthday)
			VALUES
			('Amy', '11223344', '1999-04-05')
			""";	

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user",USER);
		prop.put("password",PASSWD);
		
		try(Connection conn = DriverManager.getConnection(URL, prop);
				Statement stmt = conn.createStatement()){
			int n = stmt.executeUpdate(SQL_INSERT);
			System.out.println(n);
				
			conn.close();
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
}
