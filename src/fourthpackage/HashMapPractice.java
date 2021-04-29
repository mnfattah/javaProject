package fourthpackage;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<String, String> info = new HashMap<>();
info.put("dbname", "walmart.com");
info.put("dbuser", "cashier");
info.put("dbuser1", "finance");
info.put("dbpassword", "1234abc");

        System.out.println(info);

        System.out.println(info.size());

        System.out.println(info.get("dbuser1"));

        System.out.println(info.containsValue("financ"));

    }


}
