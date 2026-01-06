package lab_A;
import apis.Bike;

//說明:字串可以怎麼被建立、怎麼從資料中切一段出來、怎麼拿其中一個字，
//以及「直接把物件拿去印」會發生什麼事。

public class Brad_21 {

	public static void main(String[] args) {
		String s1 = new String();
		byte[] b2 = { 97, 98, 99, 100 };
		String s2 = new String(b2);
		System.out.println(s1);
		System.out.println(s2);

		Bike b1 = new Bike();
		System.out.println(b1);

		String s3 = new String(b2, 1, 2);
		System.out.println(s3);

		char c1 = '資';
		char c2 = s2.charAt(2);
		System.out.println(c2);

	}
}