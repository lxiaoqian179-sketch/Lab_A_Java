package lab_A;
import java.util.List;

import apis.Gift;
import apis.JdbcTool;

public class Brad12 {

	public static void main(String[] args) {
		JdbcTool tool = new JdbcTool();
		String sql = """
				SELECT name, addr, tel
				FROM gift
				WHERE name LIKE? OR addr LIKE?				
				""";
		
		
		List<Gift> gifts = tool.query(sql, rs -> {
			Gift gift = new Gift();
			gift.setName(rs.getString("name"));
			gift.setAdd(rs.getString("addr"));
			gift.setTel(rs.getString("tel"));			
			return gift;			
		},"%禮盒%", "%%");
		
		for(Gift gift: gifts) {
			System.out.println(gift);
		}
		
		System.out.println("----");
		gifts.forEach(System.out::println);
		
		
		
		

	}

}
