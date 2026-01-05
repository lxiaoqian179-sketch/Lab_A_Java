package lab_A;

public class VII {
	
//	模擬擲骰子 100 次，統計 1～6 點各自出現的次數，並將結果印出來。
//	還要「驗證亂數是否真的只會落在 1～6」
//	新增 p0 當作「異常計數器」
//	在 switch 中加入 default，用來捕捉非法值
	
//	switch版本 : 較不推薦
	
//	switch 適合：
//	每個 case 行為完全不同、	有複雜邏輯、不是單純計數
//	switch 是在寫「流程」，程序導向
	

	public static void main(String[] args) {
	    int p0, p1, p2, p3, p4, p5, p6;
	    p0 = p1 = p2 = p3 = p4 = p5 = p6 = 0;

	    for (int i = 0; i < 100; i++) {
	        int point = (int)(Math.random() * 6) + 1;  // 1 ~ 6

	        switch (point) {
	            case 1: p1++; break;
	            case 2: p2++; break;
	            case 3: p3++; break;
	            case 4: p4++; break;
	            case 5: p5++; break;
	            case 6: p6++; break;
	            default: p0++;
	        }
	    }
	    if (p0 > 0) {
	    	System.out.println("ERROR : " + p0);
	    	
	    }else
	    System.out.printf("%d點出現%d次\n", 1, p1);
	    System.out.printf("%d點出現%d次\n", 2, p2);
	    System.out.printf("%d點出現%d次\n", 3, p3);
	    System.out.printf("%d點出現%d次\n", 4, p4);
	    System.out.printf("%d點出現%d次\n", 5, p5);
	    System.out.printf("%d點出現%d次\n", 6, p6);
	}
}
