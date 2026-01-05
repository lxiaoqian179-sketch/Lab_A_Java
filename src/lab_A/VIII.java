package lab_A;

public class VIII {

    public static void main(String[] args) {
    	
//    	陣列版本_擲骰子_推薦此版本 	
    	
//    	陣列版本之所以成立、而且優雅，核心關鍵就是「索引（index）」的特性被正確利用。
//    	把「資料的意義」直接對齊到「索引的位置」
//    	換句話說：索引本身就是邏輯的一部分，而不是只是拿來存資料的工具。
//    	index 當作 "mapping function "
    	
    	
//    	陣列適合：	統計、映射、累加、分類
//    	陣列	   是在建「模型」，資料導向
    	
//    	switch 是在寫「流程」，程序導向
    	   	
    	
        int[] p = new int[7];

        for (int i = 0; i < 100; i++) {
            int point = (int)(Math.random() * 6) + 1;  // 1 ~ 6

            if (point >= 1 && point <= 6) {
                p[point]++;
            } else {
                p[0]++;
            }
            
//            if (point >= 1 && point <= 6) {
//                p[point]++;
//            } else {
//                p[0]++;
//            }
//            上面這一段是陣列版本的核心，白話解釋： 如果骰子是合法點數 → 直接用「點數本身」當索引
//            否則 → 丟到錯誤桶
//            為什麼這版本 switch 好？ 因為此版本為"資料驅動邏輯，而不是硬編碼分支"

        }

        if (p[0] > 0) {
            System.out.println("ERROR: " + p[0]);
//            System.out.println("ERROR: " + p[0]);
//            p[0] 為 錯誤 / 非法點數，因此 此區為錯誤檢查區。
            
        } else {
            for (int i = 1; i < p.length; i++) {
                System.out.printf("%d點出現%d次\n", i, p[i]);
            }
        }
    }
}