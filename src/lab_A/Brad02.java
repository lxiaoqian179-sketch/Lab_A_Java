package lab_A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Brad02 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/iii";
		String user = "root";
		String password = "root";

		Properties prop = new Properties();
		prop.put("user", user);
		prop.put("password", password);

		try (Connection conn = DriverManager.getConnection(url, prop)) {
			System.out.println("OK");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
