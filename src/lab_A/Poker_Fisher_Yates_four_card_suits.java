package lab_A;

public class Poker_Fisher_Yates_four_card_suits {
//	再延伸寫 四人發牌版本_撲克牌花色!
	
//	這一版實際整合了：
//	1 	Fisher–Yates 洗牌
//	2 	一維陣列（牌堆）
//	3 	二維陣列（玩家手牌）
//	4 	% 與 / 的實際用途
//	5	抽象數字 → 實體意義的轉換
//	6	可讀輸出設計		

	public static void main(String[] args) {

		// 1️ 建立一副不重複的牌（0 ~ 51）
		int[] poker = new int[52];
		for (int i = 0; i < 52; i++) {
			poker[i] = i;
		}

		// 2️ Fisher–Yates 洗牌
		for (int i = poker.length - 1; i > 0; i--) {
			int j = (int) (Math.random() * (i + 1));

			int temp = poker[i];
			poker[i] = poker[j];
			poker[j] = temp;
		}

		// 3️ 發牌給 4 個人（每人 13 張）
		int[][] players = new int[4][13];
		for (int i = 0; i < poker.length; i++) {
			players[i % 4][i / 4] = poker[i];
		}

		// 4️ 花色與點數對照表
		String[] suits = { "♠", "♥", "♦", "♣" };
		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
//		String[] suits = { "♠", "♥", "♦", "♣" };
//		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
//		最重要的「轉換核心」只在這兩行!!
//		card / 13 → 決定花色
//		card % 13 → 決定點數		
		
		
		// 5️ 輸出結果（轉成人類看得懂的牌）
		for (int p = 0; p < players.length; p++) {
			System.out.println("玩家 " + (p + 1) + "：");

			for (int card : players[p]) {
				String suit = suits[card / 13];
				String rank = ranks[card % 13];
				System.out.print(suit + rank + "  ");
			}

			System.out.println("\n");
		}
	}
}