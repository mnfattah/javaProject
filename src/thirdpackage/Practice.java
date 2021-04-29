package thirdpackage;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Juwel();
        //calculator();
    }

    public static void calculator() {

        Scanner s = new Scanner(System.in);
        System.out.println("Please insert your name");
        String name = s.next();
        System.out.println("Please insert your age");
        int age = s.nextInt();

        if (age > 18) {
            System.out.println(name + " You are welcome");
        } else {
            System.out.println(name + "" + " You are underage");
        }
    }

    public static void Juwel() {

        Scanner m = new Scanner(System.in);
        System.out.println("Please insert your name");
        String person = m.next();
        System.out.println("Please enter the first number");
        int num1 = m.nextInt();
        System.out.println("Please enter the second number");
        int num2 = m.nextInt();
        System.out.println("If you want addition press 1");
        System.out.println("If you want subtraction press 2");
        int condition = m.nextInt();
        int total = 0;
        if (condition == 1) {

            total = num1 + num2;
            System.out.println(person + " your total is " + total);
        } else {
            total = num1 - num2;
            System.out.println(person + " your total is " + total);
        }
    }

}
