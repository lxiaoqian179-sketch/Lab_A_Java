package lab_A;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Brad53 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(7777);
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);

            while (true) {
                socket.receive(packet);

                byte[] data = packet.getData();
                int len = packet.getLength();
                InetAddress urip = packet.getAddress();
                String mesg = new String(data, 0, len);

                System.out.printf("%s : %s\n",
                        urip.getHostAddress(), mesg);

                if ("bye".equals(mesg)) {
                    System.out.println("Server shutdown.");
                    break;
                }
            }

            socket.close(); // ✅ 跳出迴圈後再關
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
