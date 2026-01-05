package lab_A;

public class Poker_Final {
//	版本04
	
//	跟Poker_Fisher_Yates版本，2者比較上，效能完全相同。
//	對電腦來說_一樣，但對"人"來說_此版本比較好(可讀性及維護性更高)

	public static void main(String[] args) {

		final int num = 52;
		int[] poker = new int[num];

		// 建立一副不重複的牌（0 ~ 51）
		for (int i = 0; i < num; i++) {
			poker[i] = i;
		}

		// Fisher–Yates 洗牌
		for (int i = num - 1; i > 0; i--) {
			int r = (int) (Math.random() * (i + 1));

			// poker[i] <=> poker[r]
			int temp = poker[i];
			poker[i] = poker[r];
			poker[r] = temp;
		}
		// Fisher–Yates 洗牌完成後
		for (int v : poker) {
			System.out.println(v);
		}

	}
}