package lab_A;
//把一個網域名稱（Domain Name），
//透過 DNS 查詢，轉換成對應的 IP 位址，並印出來。

//換句話說：👉 這是一支「DNS 查詢」的小程式。

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad_51 {

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.iii.org.tw");
            System.out.println(ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }

}
