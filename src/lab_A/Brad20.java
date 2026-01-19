package lab_A;
//有錯，待補

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Brad20 {
	private static final String URL = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String SQL_QUERY = """
			SELECT `CustomerID`, `CompanyName`
FROM `customers` 
WHERE `CustomerID` IN (
	SELECT `CustomerID`
    FROM orders
    WHERE OrderDate BETWEEN '1997-01-01' AND '1997-12-31'
)

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
				PreparedStatement pstmt = conn.prepareStatement(SQL_QUERY)){
			
			pstmt.setInt(1, 1);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				InputStream in = rs.getBinaryStream("bike");
				ObjectInputStream oin = new ObjectInputStream(in);
				Object obj = oin.readObject();
				if(obj instanceof Bike) {
					Bike bike = (Bike)obj;
					System.out.println(bike);
				}
								
			}else {
				System.out.println("Member NOT EXIST");

				
			
		}catch(IOException e) {
			System.out.println(e);
		}catch (SQLException e) {
			System.out.println(e);
		
		}catch (Exception e) {
			System.out.println(e);
		}
	}