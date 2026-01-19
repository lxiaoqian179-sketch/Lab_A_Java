package lab_A;
//待補

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.JdbcPreparedStatement;

public class Brad15 {

		private static final String URL = "jdbc:mysql://localhost:3306/Brad";
		private static final String USER = "root";
		private static final String PASSWD = "root";
		private static final String SQL_QUERY = """
				SELECT id, email, name, icon
				FROM member
				WHERE id = ?
				""";
		
		public static void main(String[] args) {
			try(FileInputStram fin = new FileInputStram("dir2/test.jpg");
					Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
					PreparedStatement pstmt = conn.preparedStatement(SQL_QUERY)){
				
				
				pstmt.setInt(1, 1);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					String email = rs.getString("email");
					String fname = String.format("email");
					
					
					InputStream in = rs.getBinaryStream("dir2/%s.png", email);
					byte[]data = in.readAllBytes();
					fout.write(data);
					fout.flash();
					System.out.println("OK");
				}else {
					System.out.println("Member NOT EXIST");
				}
				
				
								
			}catch(IOException e) {
				System.out.println(e);
				try
			
			
				
			}
	}

}
