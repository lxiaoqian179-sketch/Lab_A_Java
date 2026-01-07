package lab_A;

//這支程式在示範三件事：
//1	怎麼從字串拿出某一個字
//2	== 在「數字」跟「字串」上到底在比什麼
//3 為什麼字串要用 equals()，不能亂用 ==


public class Brad_22 {

	public static void main(String[] args) {
		System.out.println("Brad".charAt(2));
		String s1 = "Brad";
		String s2 = "Brad";
		int a = 10, b = 3;
		System.out.println(a == b);
		System.out.println(s1 == s2);
		String s3 = new String("Brad");
		String s4 = new String("Brad");
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);

		System.out.println(s1.equals(s4));

	}

}