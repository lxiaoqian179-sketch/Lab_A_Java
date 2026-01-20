package lab_A;

import java.util.Scanner;

import apis.*;

public class Brad19 {

	public static void main(String[] args) {
		System.out.println("Member Login");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Email: ");
		String email = scanner.nextLine();
		System.out.print("Password: ");
		String passwd = scanner.nextLine();
		
		MemberDAO dao = new MemberDAOImpl();
		try {
			Member member = dao.login(email, passwd);
			if (member != null) {
				System.out.printf("Welcome, %s", member.getName());
			}else {
				System.out.println("Login Failure");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}