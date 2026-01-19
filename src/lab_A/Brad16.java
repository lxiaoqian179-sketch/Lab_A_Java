package lab_A;
//Bike沒有連接

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Brad16 {
	private static final String URL = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String SQL_UPDATE = """
			UPDATE member
			SET icon = ?
			WHERE id = ?
			""";

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.upSpeed().upSpeed().upSpeed();
		System.out.println(bike);
		
		try (FileInputStream fin = new FileInputStream("dir1/ball2.png");
				Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
				PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE)){
			
			pstmt.setObject(1, bike);
			pstmt.setInt(2, 1);
			int n = pstmt.executeUpdate();
			System.out.println(n);
			
//		}catch(IOException e) {
//			System.out.println(e);
			
		}catch (SQLException e) {
			System.out.println(e);
		}
	}

}