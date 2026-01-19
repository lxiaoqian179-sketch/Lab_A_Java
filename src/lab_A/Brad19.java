package lab_A;

import apis.MemberDAO;

public class Brad19 {

	public static void main(String[] args) {
		System.out.println("Member Login");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Email: ");
		String email = scanner.nextLine();
		System.out.println("Password: ");
		String passwd = scanner.nextLine();
		
		
		MemberDAO dao = new MemberDAOImpl();
		try {
			Member member = dao.login(email,  passwd);
			if (member != null) {
				System.out.println("Welcome, %s", member.getName());
			}else {
				System.out.println("Login Failure");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
