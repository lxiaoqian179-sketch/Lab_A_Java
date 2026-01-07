package lab_A;
//這支程式在做兩件事：
//1	亂數印一個 0～1 之間的小數
//2	檢查一組「看起來像身分證」的字串，然後印出檢查結果



import apis.TWId;

public class Brad_23 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(TWId.isRight("A123456789"));
		System.out.println("---");
		TWId id1 = new TWId();
		TWId id2 = new TWId(false);
		TWId id3 = new TWId('P');
		TWId id4 = new TWId(true,'C');
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id3);
		System.out.println(id4);
	}

}