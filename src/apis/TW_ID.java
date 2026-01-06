package apis;
//定義一個 台灣身分證 類別

public class TW_ID {
	private String id;//字串
	
	public static boolean isRight(String id) {
		boolean isRight = false;
		
//		if (id.length() == 10) {
//			char c1 = id.charAt(0);
//			String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//			if (letters.indexOf(c1) != -1) {
//				char c2 = id.charAt(1);
//				if (c1 == '1' || c2 == '2') {
//					
//				}
//			}
//		}

		if (id.matches("[A-Z][12][0-9]{8}")) {
			
		}
		
		
		return isRight;
	}
	
	
}
	

