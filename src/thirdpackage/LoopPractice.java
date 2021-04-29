package thirdpackage;

public class LoopPractice {


    //psvm
    public static void main(String[] args) {


        //sout
        //Increment
        /*
        for (int i = 0; i < 10; i++) {
           // System.out.println("I love Java"+i);
        }
        //decrement
        for (int i = 10; i > 0; i--) {
           // System.out.println("I love Python"+i);
        }
        */
        //
        //print java 10 times
        //for each time of java, print selenium 2 times
        for (int i = 0; i < 10; i++) {
            //System.out.println("I love Java" + i);
            for (int j = 0; j < 2; j++) {
                // System.out.println("Selenium" + i);
            }
        }

        //conditional for loop
        //count till 10, if the number is 5, print java
        //if the number is 6 print selenium
        //for the rest print python

        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                System.out.println("JAVA" + k);
            } else if (k == 6) {
                System.out.println("SELENIUM" + k);

            } else {
                System.out.println("PYTHON" + k);
            }
        }
        /*
        Srting country1 = "usa";
        String country2 = "canada";

        if (country1.equals(country2)){
            System.out.println("countries are same");
        }
        else {
            System.out.println("countries are different");
        }*/


    }
}
