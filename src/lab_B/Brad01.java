package lab_B;
//整支程式的「一句話本質」
//這支程式不是在連資料庫，
//而是在確認「JDBC Driver 是否存在並可被 JVM 載入」。

public class Brad01 {

	public static void main(String[] args) {
//		開始一個 try-catch 區塊，
//		接下來的程式碼可能拋出受檢例外（Checked Exception）
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			透過「完整類名」載入一個 class
//			JVM 會找到 com.mysql.cj.jdbc.Driver 這個類別，將它載入記憶體
//			讓 JDBC 知道「我現在有 MySQL Driver 可用」。			
			
			System.out.println("OK");
//			如果成功載入 Driver，程式會執行到這一行
//			代表:Driver jar 存在、類名正確、環境設定成功
		}catch (ClassNotFoundException e) {
//			捕捉 Class.forName(...) 可能拋出的例外
//			ClassNotFoundException 是：
//			編譯時不會知道，執行時才會發現的錯誤
			
			System.out.println(e);
//			將錯誤訊息印出
//			常見錯誤內容：找不到 com.mysql.cj.jdbc.Driver
		}//結束 try-catch

	}//結束 main

}//結束類別

