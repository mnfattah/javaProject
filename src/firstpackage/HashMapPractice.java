package firstpackage;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<String,Integer> hmap = new HashMap<>();

        hmap.put("VA", 22309);
        hmap.put("MD", 22910);
        hmap.put("NY", 25631);

        System.out.println(hmap);

        System.out.println(hmap.get("MD"));


        HashMap<String, Integer> hmap1 = new HashMap<>();

        hmap1.put("CA", 58263);
        hmap1.put("OH", 96523);
        hmap1.putAll(hmap);
        System.out.println(hmap1);

        System.out.println("**********");


        ArrayList<String> al =new ArrayList<>();
        al.add("VA");
        al.add("NY");
        al.add("MD");

        HashMap<String, ArrayList<String>> ha = new HashMap<>();

        ha.put("USA", al);
        System.out.println(ha);
    }
}
