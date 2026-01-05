package lab_A;

public class Poker_new {
//	版本02
//	撲克牌情境，亂數不會重複了!
	
//	這是一個 「用檢查機制避免亂數重複」 的版本，本質是：
//	不斷抽亂數，若重複就重抽(退回)，直到放進不重複的牌(由j審核通過，使用布林值判斷)	
	
//	BUT，你現在的寫法屬於「邏輯正確，但效能不佳」的版本 QWQ
	
	
//	為什麼這段程式「能正確避免重複」？
//	因為你同時做了三件事：
//	1 亂數產生(int[] poker = new int[52];)
//	2 與既有資料比對(int j 的角色功用)
//	3 失敗就回退流程(i--)	
	
	
//	關鍵概念:
//		為什麼 j < i，而不是 j < poker.length？
//		答案是：因為只需要檢查目前「已經放好的牌」，後面的牌還不存在。

	public static void main(String[] args) {

		int[] poker = new int[52];

		for (int i = 0; i < poker.length; i++) {
			int temp = (int) (Math.random() * 52);

			// 檢查機制
			boolean isDup = false;
			for (int j = 0; j < i; j++) {
				if (temp == poker[j]) {
					isDup = true;
					break;
				}
			}

			if (!isDup) {
				poker[i] = temp;
				System.out.println(poker[i]);
			} else {
				i--;
			}
		}
	}
}