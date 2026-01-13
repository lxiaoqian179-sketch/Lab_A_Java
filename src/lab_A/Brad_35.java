package lab_A;
//這段程式建立一個 Map<String, Object> 作為鍵值資料表，
//將不同型別的資料（姓名、年齡、體重、性別）以字串鍵存入，
//並透過鍵名稱取出對應的值後輸出到主控台。

import java.util.HashMap;
import java.util.Map;

public class Brad_35 {

    public static void main(String[] args) {
        Map<String, Object> maps = new HashMap<>();
        maps.put("name", "Lisa");
        maps.put("age", 26);
        maps.put("weight", 50);
        maps.put("gender", false);// 性別，男生true ，女生false。

        System.out.println(maps.get("name"));
        System.out.println(maps.get("age"));
        System.out.println(maps.get("weight"));
        System.out.println(maps.get("gender"));
    }
}


//延伸 : 如果你「真的要像 SQL 一樣安全」該怎麼做?

//class Person {
//    private String name;
//    private int age;
//    private double weight;
//    private boolean gender;
//}

//這就是 Java 世界的「資料表 Schema」


