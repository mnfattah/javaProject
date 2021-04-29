package secondpackage;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Army");
        hs.add("Navy");
        hs.add("Police");

        System.out.println(hs);

        for (String a : hs) {

            System.out.println(a);

        }


    }
}
