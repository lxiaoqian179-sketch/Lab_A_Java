package lab_B;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
//Connection:代表Java與資料庫的一條實體連線
//DriverManager:JDBC的驅動管理者，負責 找Driver、建立Connection
//SQLEXception:所有JDBC操作的核心例外型別
//Properties:Key/Value結構


public class Brad02 {

	public static void main(String[] args) {
		
//		sql server
//		url = "jdbc:sqlserver://localhost:1433;databaseName=iii;"
//		user=sa;password=123456""
//		mysql:
//		url = "jdbc:mysql://localhost:3306/iii?user=root&password=root";
		
	   String url = "jdbc:mysql://localhost:3306/iii";
	   String user = "root";
	   String passwd = "root";
	   
	   Properties prop = new Properties();
	   prop.put("user", user);
	   prop.put("password", passwd);
	   
	   try {
		   Connection conn = DriverManager.getConnection(url, prop);
		   conn.close();
		   System.out.println("OK");
	   }catch(SQLException e) {
		   System.out.println(e);
	   }
	   
		
			
			
				

		
	}

}
