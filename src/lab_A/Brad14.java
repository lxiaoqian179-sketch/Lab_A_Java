package lab_A;
//找不出錯在哪裡??

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Brad14 {

		private static final String URL = "jdbc:mysql://localhost:3306/Brad";
		private static final String USER = "root";
		private static final String PASSWD = "root";
		private static final String SQL_UPDATE = """
				UPDATE member
				SET icon = ?
				WHERE id = ?
				""";
		
		public static void main(String[] args) {
			try(FileInputStream fin = new FileInputStream("dir1/ball3.jpg");
					Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
					PreparedStatement pstmt = conn.preparedStatement(SQL_UPDATE)){
				
				
				pstmt.setBinaryStream(1, fin);
				pstmt.setInt(2,  2);
				int n = pstmt.executeUpdate();
				System.out.println(n);
				
			}catch(IOException e) {
				System.out.println(e);
			}catch(SQLxception e) {
				System.out.println(e);
			}
	}

}
