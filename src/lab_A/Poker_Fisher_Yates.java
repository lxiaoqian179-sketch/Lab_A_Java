package lab_A;

public class Poker_Fisher_Yates {
//	版本03(我的最愛)
	
//	總結:	
//	建立一副 52 張不重複的牌，
//	並使用 Fisher–Yates 演算法把它「真正洗亂」
	
	
//	為什麼這支程式「又快又正確」？關鍵原因只有三個：
//	1 一開始就沒有重複
//	2 每張牌只交換一次
//	3 沒有任何失敗流程
	
	
//	# 補充說明
//	int i   指向「目前要固定的那一張牌的位置」
//	int j  「在『尚未洗好的區間 (0 ~ i)』中，隨機挑一張牌，來跟目前這張牌交換位置」
//	temp    暫存交換用的中介變數


	public static void main(String[] args) {
		int[] poker = new int[52];
		for (int i = 0; i < 52; i++) {
			poker[i] = i;
			
//				int[] poker = new int[52];
//				for (int i = 0; i < 52; i++) {
//					poker[i] = i;
//			建立一個長度為 52 的整數陣列，	每個位置放一張「唯一的牌編號」
			
			
		}
		for (int i = poker.length - 1; i > 0; i--) {
			int j = (int) (Math.random() * (i + 1));

			int temp = poker[i];
			poker[i] = poker[j];
			poker[j] = temp;
//			for (int i = poker.length - 1; i > 0; i--) { 
//			i 從最後一張牌（51）開始，每一輪都把 poker[i] 「固定下來」，已處理過的牌不會再被動到
//			// ex: 51、50、49 ... 1（i > 0）
			
//				int j = (int) (Math.random() * (i + 1));
//			// j 會落在 0 ~ i 之間，只從「還沒洗好的範圍」選，（隨著 i 減少，可選範圍也會越來越小）
			
//				
//				int temp = poker[i];
//				poker[i] = poker[j];
//				poker[j] = temp;
//			用 temp 當中介變數，將第 i 張與第 j 張對調(沒有判斷、沒有檢查，單純交換_swap)
			
//			(以上為最核心的一段!!從最後一張開始，隨機選一張「還沒固定的牌」來交換位置)
			
			
		}
		for (int v : poker) {
			System.out.println(v);
		}
//		for (int v : poker) {
//			System.out.println(v);
//		}		
//		使用 for-each 逐一走訪牌組，將洗好的 52 張牌依序印出

	}

}
