package lab_A;
//建立一個 List<String> 來儲存多個姓名。
//1	先印出名單總數，
//2	再依序列出所有內容，
//3	最後透過索引，直接取得，並輸出指定位置的姓名。

import java.util.ArrayList;
import java.util.List;

public class Brad_34 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Brad");
        names.add("Andy");
        names.add("Brad");
        names.add("Tony");
        names.add("Mark");
        names.add("Eric");

        System.out.println(names.size());

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("---");
        System.out.println(names.get(0));
        System.out.println(names.get(3));
    }
}