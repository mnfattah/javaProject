package fourthpackage;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice1 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Juwel");
        al.add("Real");
        al.add("Lina");

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Bishal");
        al1.add("Labib");
        al1.add("Afifa");


        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        hm.put("1stGeneration", al);
        hm.put("2ndgeneration", al1);

        System.out.println(hm);


        System.out.println("*************");

        HashMap<String, Integer> state = new HashMap<>();
        state.put("VA", 22309);
        state.put("NY", 56238);

        HashMap<String, Integer> state1 =new HashMap<>();
        state1.put("Pabna", 25423);
        state1.put("Ishwardi", 58769);


        ArrayList<HashMap<String,Integer>> usa = new ArrayList<>();

        usa.add(state);
        usa.add(state1);

        System.out.println(usa);

        HashMap<String, Integer> b = usa.get(1);
        int value = b.get("Ishwardi");
        System.out.println(value);
    }
}
