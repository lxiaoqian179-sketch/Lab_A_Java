package apis;
import java.util.List;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JdbcTool {
	private static final String URL = "jdbc:mysql://localhost:3306/Brad";
	private static final String USER = "root";
	private static final String PASSWD = "root";	
	
	public <T> List  query(String sql, RowMapper<T> rowMapper,Object...args) {
		List<T> list = new ArrayList<>();
				
		try(Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			for(int i=0; i<args.length; i++) {
				pstmt.setObject(i+1, args[i]);
			}
			
			//純粹自動關閉
			try (ResultSet rs =pstmt.executeQuery()){
				while (rs.next()) {
					T item = rowMapper.mapRow(rs);
					list.add(item);
				}
				
			}
			
			
					
				}catch(Exception e) {
					System.out.println(e);
				}
		
		return null;
	}

}
