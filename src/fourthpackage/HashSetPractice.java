package fourthpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

    public static void main(String[] args) {

        HashSet <String> HS = new HashSet<>();

        ArrayList<String> AL = new ArrayList<>();

        HS.add("VA");
        HS.add("NY");
        HS.add("MD");

        System.out.println(HS);
/*
        for (String a : HS){
            //String a = i.toString();
            System.out.println(a);
            AL.add(a);

        }*/
        Iterator it = HS.iterator();
        while (it.hasNext()) {

            String s = it.next().toString();
            AL.add(s);
        }
        System.out.println(AL);
    }

}
