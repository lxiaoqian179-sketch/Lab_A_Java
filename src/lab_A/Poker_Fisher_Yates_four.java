package lab_A;

public class Poker_Fisher_Yates_four {
//	延伸寫 四人發牌版本!
//	目前還沒看完全懂QWQ  老師說 : 這段算是相對較困難的，因為結合很多概念...
	
//	這一版實際整合了：
//	1 	Fisher–Yates 洗牌
//	2 	一維陣列（牌堆）
//	3 	二維陣列（玩家手牌）
//	4 	% 與 / 的實際用途
//	5	for / for-each 的角色差異		

    public static void main(String[] args) {

        // 1️ 建立一副不重複的牌（0 ~ 51）
        int[] poker = new int[52];
        for (int i = 0; i < 52; i++) {
            poker[i] = i;
        }

        // 2️ Fisher–Yates 洗牌
        for (int i = poker.length - 1; i > 0; i--) {
            int j = (int)(Math.random() * (i + 1));

            int temp = poker[i];
            poker[i] = poker[j];
            poker[j] = temp;
        }

        // 3️ 宣告 4 人的手牌（每人 13 張）
        int[][] players = new int[4][13];//使用 二維陣列 int[4][13]
        

        // 4️ 發牌
        for (int i = 0; i < poker.length; i++) {
            players[i % 4][i / 4] = poker[i];
//            players[i % 4][i / 4] = poker[i];
//            發牌「核心邏輯」只在這一行（非常重要）!!!            
            
//            i % 4：決定「給誰」(0 → 玩家 0, 1 → 玩家 1...)
//            i / 4：決定「第幾張手牌」(0 ~ 3   → 第 0 張, 4 ~ 7   → 第 1 張...)
            
        }

        // 5️ 輸出結果
        for (int p = 0; p < players.length; p++) {
            System.out.println("玩家 " + (p + 1) + "：");
            for (int card : players[p]) {
                System.out.print(card + " ");
            }
            System.out.println("\n");
        }
    }
}
