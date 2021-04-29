package secondpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<>();

        hmap.put("VA", 22309);
        hmap.put("MD", 22910);
        hmap.put("NY", 25361);

        System.out.println(hmap);

        System.out.println(hmap.get("MD"));

        HashMap<String, Integer> hmap1 = new HashMap<>();
        hmap1.put("CA", 25814);
        hmap1.put("OH", 24698);

        System.out.println(hmap1);

        hmap1.putAll(hmap);
        System.out.println(hmap1);

        System.out.println("*******");

        ArrayList<String> al = new ArrayList<>();
        al.add("VA");
        al.add("MD");
        al.add("NY");


        HashMap<String, ArrayList<String>> ha = new HashMap<>();

        ha.put("USA", al);
        System.out.println(ha);


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter four state name");

        String d1 = keyboard.next();
        String d2 = keyboard.next();
        String d3 = keyboard.next();
        String d4 = keyboard.next();

        System.out.println("Please enter four city name");

        String p1 = keyboard.next();
        String p2 = keyboard.next();
        String p3 = keyboard.next();
        String p4 = keyboard.next();

        keyboard.close();

        HashMap<String, String> usa = new HashMap<>();
        usa.put(d1, p1);
        usa.put(d2, p2);
        usa.put(d3, p3);
        usa.put(d4, p4);

        System.out.println(usa);
    }

}
