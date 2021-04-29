package thirdpackage;

import java.util.Scanner;

public class ScannerPractice {


    public static void main(String[] args) {
        math();
    }

    public static void math() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name");
        String name = scanner.next();

        System.out.println("Please insert number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Please insert number 1: ");
        int number2 = scanner.nextInt();

        //int total = number1+number2;
        System.out.println("If you want to + insert 1");
        System.out.println("If you want to + insert 2");

        int condition = scanner.nextInt();
        int total = 0;

        if (condition == 1) {
            total = number1 + number2;
        } else if (condition == 2) {
            total = number1 - number2;
        }
        System.out.println(name + "'s" + " Total is " + total);

    }


}
