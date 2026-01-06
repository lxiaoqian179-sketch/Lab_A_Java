package lab_A;
//最小可執行的 JFrame 範例

//JFrame 是 Java Swing 中「視窗本身」的類別，
//是所有 GUI 元件的最外層容器，也是學習 Java 視覺化與事件處理的起點。

import javax.swing.JFrame;

public class Brad_20 {

	public static void main(String[] args) {
        JFrame frame = new JFrame("我的第一個視窗");
        

        frame.setSize(400, 300);              // 視窗大小
        frame.setLocationRelativeTo(null);    // 視窗置中
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);               // 顯示視窗
    }
}