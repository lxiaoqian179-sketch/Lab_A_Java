package lab_A;

public class Brad_15 {

//	二維陣列的概念說明!!非常重要!

	public static void main(String[] args) {
		int a;
		int[] a1;
		int[][] a2 = new int[2][3]; // 2 x 3

		System.out.println(a2);
		System.out.println(a2.length);
		System.out.println(a2[0]);
		System.out.println(a2[0].length);
		System.out.println("-----");

//	        System.out.println(a2); 			一個裝著陣列的"陣列"(陣列包陣列，包著2個一維array)  [[I@28a418fc
//	        System.out.println(a2.length);  	有"幾個"一維陣列(數量，有2個一維array)   		  2
//	        System.out.println(a2[0]);  		第 0 個一維"陣列"(ex:[0,0,0])				  [I@5305068a
//	        System.out.println(a2[0].length);   那個一維陣列的"長度"(ex:3)					  3

		int[][] b = new int[3][];
		System.out.println(b.length);

		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[4];

		System.out.println("---");

		for (int[] v : b) {
			for (int vv : v) {
				System.out.print(vv + " ");
			}
			System.out.println();
		}
//		Java 的二維陣列是「不保證矩形」的，列與列之間可以長度不同
	}

}