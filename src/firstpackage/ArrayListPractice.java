package firstpackage;

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

        System.out.println("********");

        dow.remove("Wednesday");
        System.out.println(dow);

        System.out.println("*********");

        dow.add(2,"Wednesday");
        System.out.println(dow);

        System.out.println("*********");

        dow.set(1,"Saturday");
        System.out.println(dow);

        System.out.println("*****");

        for(String day : dow)
            System.out.println(day);

        System.out.println("***********");

        String specificelement = dow.get(0);
        System.out.println(specificelement);





    }

}
