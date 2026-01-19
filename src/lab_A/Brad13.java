package lab_A;

import java.util.List;

import apis.Gift;
import apis.JdbcTool;
import apis.Member;

public class Brad13 {

	public static void main(String[] args) {
		JdbcTool tool = new JdbcTool();
		String sql = """
				SELECT email, name
				FROM member
				""";
		
		
		List<Member> gifts = tool.query(sql, rs -> {
			Member member = new Member();
			member.setName(rs.getString("name"));
			member.setEmail(rs.getString("email"));
			return member;			
		});
		
		
		
		gifts.forEach(System.out::println);
		
	}

}
