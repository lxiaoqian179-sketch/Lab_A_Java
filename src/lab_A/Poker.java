package lab_A;

public class Poker {
	//版本01
	//撲克牌情境，亂數會重複

	public static void main(String[] args) {
        int[] poker = new int[52];

        for (int i = 0; i < poker.length; i++) {
            int temp = (int)(Math.random() * 52);
//            Q : 為什麼產生的亂數會出現重複的情況?
//            A : Math.random() 只負責「隨機取值」，完全不負責「不重複」。
//                每一次抽，都是「全新、獨立事件」，就像一直問電腦：請隨機給我一個 0～51 的數字，電腦完全不知道你之前抽過什麼。  
                      
//                錯誤思路（你現在的）: 一直亂數，卻又期待它自己不重複 ❌(根本是看運氣XD)
//            	  正確思路 : 先有完整 52 張不重複的牌，再「打亂順序」。
//            請記住 : 亂數不是魔法。亂數 ≠ 不重複；不重複必須靠「邏輯」保證。
            
            poker[i] = temp;
            System.out.println(poker[i]);
        }
    }
}