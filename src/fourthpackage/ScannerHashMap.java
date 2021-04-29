package fourthpackage;

import java.util.HashMap;
import java.util.Scanner;

public class ScannerHashMap {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter four district name");
        String d1 = keyboard.next();
        String d2 = keyboard.next();
        String d3 = keyboard.next();
        String d4 = keyboard.next();

        System.out.println("Please enter four police station name");

        String p1 = keyboard.next();
        String p2 = keyboard.next();
        String p3 = keyboard.next();
        String p4 = keyboard.next();

        keyboard.close();

        HashMap<String, String> hs = new HashMap<>();

        hs.put(d1,p1);
        hs.put(d2,p2);
        hs.put(d3,p3);
        hs.put(d4,p4);

        System.out.println(hs);
    }

}
