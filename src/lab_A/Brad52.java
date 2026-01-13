package lab_A;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Brad52 {
    public static void main(String[] args) {
    	
    	
    	
    	
        try {
            // 1. 要傳送的訊息
            String msg = "好想回家躺著";
            byte[] data = msg.getBytes();

            // 2. 指定接收端 IP（本機）
            InetAddress ip = InetAddress.getByName("10.0.101.184");
            

            // 3. 建立封包（資料 + 目的地 IP + Port）
            DatagramPacket packet =
                    new DatagramPacket(data, data.length, ip, 7777);

            // 4. 建立 UDP Socket（發送端不用指定 Port）
            DatagramSocket socket = new DatagramSocket();

            // 5. 發送封包
            socket.send(packet);
            socket.close();

            System.out.println("測試");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}