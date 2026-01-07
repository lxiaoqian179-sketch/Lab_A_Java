package lab_A;
//String 是「不可變物件（immutable object）」
//一旦建立，內容不能被改
//所有「看似修改」的方法：都是回傳新物件

import apis.Bike;

public class Brad_26 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		b1.downSpeed();
		
		System.out.println(b1);
		System.out.println("---");
		String name = "Brad";
		String n2 = name.concat("iii");
		System.out.println(name);
		System.out.println(n2);
	}

}