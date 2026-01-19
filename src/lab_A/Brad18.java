package lab_A;

import apis.MemberDAO;
import apis.MemberDAOImpl;

public class Brad18 {
	public static void main(String[]args) {
		MemberDAO dao = new MemberDAOImpl();
		
//		Member member = new Member();
//		member.setEmail("b1@brad.tw");
//		member.setPasswd("12345678");
//		member.setEmail("B1");
		
		
//		try {
//			if(dao.delMember(3)) {
//				System.out.println("DELETE success");
//			}else {
//				System.out.println("DELETE failure");
//			}
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		try {
			Member member = dao.findById(2);
			System.out.println(member.getEmail()+":"+member.getName());
			member.setEmail("b1@brad.tw");
			member.setPasswd("12345678");
			if(dao.updateMember("12345678"))
		}
		

		
		
		
		
	}

}
