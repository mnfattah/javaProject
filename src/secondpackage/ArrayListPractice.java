package secondpackage;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> dow = new ArrayList<>();

        dow.add("Monday");
        dow.add("Tuesday");
        dow.add("Wednesday");
        dow.add("Thursday");
        dow.add("Friday");

        System.out.println(dow);
        System.out.println(dow.size());

        dow.remove("Wednesday");
        System.out.println(dow);

        dow.add(2, "Wednesday");
        System.out.println(dow);

        dow.set(4, "Saturday");
        System.out.println(dow);

        for (String day : dow)
            System.out.println(day);

        System.out.println("*********");

        String specificDay = dow.get(4);
        System.out.println(specificDay);

    }
}
