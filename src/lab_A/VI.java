package lab_A;

public class VI {

	public static void main(String[] args) {		
		
//		這個檔案提到的概念 : 陣列、基本型別、參考型別、for each的含意
		
		int a;
		int[] b;
		a = 10;
		b = new int[3];
//		完成初始化(永遠一定有值)，整數空間，3個字元
		
		System.out.println(a);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);		
//		System.out.println(b[300]);
//		執行時期的例外異常
		
		System.out.println(a);		
//		System.out.println(a);
//		印出10，基本型別：變數 = 值
		
		System.out.println(b);
//		System.out.println(b);
//		[I@28a418fc，參考型別：變數 = 指向物件的參考
//		代表: 我是一個 int 陣列物件，現在用這個代號暫時代表我。
//		"不是"我在電腦 RAM 裡的真實記憶體位址
		
		
		b[1] = 123;
		b[2] = 7;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
//			印出0 123 7
		}
		System.out.println("---");
//		印出---
		
		
//		for each 代表 :
//		「索引我不要，你幫我一個一個拿，我只關心值。」
		
		for(int v : b) {
//			for(int v : b)代表
//			「從陣列 b 裡面，依序拿出每一個 int，放到 v 裡」 
			
			System.out.println(v);
//			印出0 123 7
			
		}				
	}
}
