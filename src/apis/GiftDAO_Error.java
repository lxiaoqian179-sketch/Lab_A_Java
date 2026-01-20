package apis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class GiftDAO_Error {
	public class Brad14 {
		private static final String URL = "jdbc:mysql://localhost:3306/Brad";
		private static final String USER = "root";
		private static final String PASSWD = "root";
		private static final String SQL_FIND_ALL = """
				select id, name, feature, addr, tel
				from gift
				order by id
				""";

		private static ResultSet rs;
		private static String[] fieldNames;

		public GiftDAO() throws Exception {
			query();
		}

		private void query() throws Exception {
			try (Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
					PreparedStatement pstmt = conn.preparedStatement(SQL_FIND_ALL, 
							ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE)) {
				rs = pstmt.executeQuery();
				
				
				
				ResultSetMetaData rsmd = rs.getMetaData();
				fieldNames = new String[rsmd.getColumnCount()];
				for (int i =0; i< fieldNames.length; i++) {
					fieldNames[i] = rsmd.getColumnLabel(i)l;
				}
				
			}
		}

		public int getRows() {
			try {
				rs.last();
				return rs.getRow();
			} catch (Exception e) {
				return 0;
			}
		}

		public int getCols() {
			return 3;
		}

		public String getData(int row, int col) {
			return "Brad";
		}
	}
}
