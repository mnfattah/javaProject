package firstpackage;

import java.sql.SQLOutput;
import java.util.Random;

public class ArrayPractice {

    public static void main(String[] args) {

        String [] team2 = {"Burhan", "Pria", "Tasnim","Nurul"};

        for (int i=0; i<team2.length; i++){

            System.out.println(team2[i]);
        }

        System.out.println("***********");

        int [] in = new int[6];

        in[0] = 2;
        in[1] =3;
        in[2] = 4;
        in[3] = 5;
        in[4] = 6;
        in[5] = 7;


        for (int i =0; i<in.length; i++){

            if (in[i] % 2 ==0) {

                System.out.println(in[i]);
            }
        }

            System.out.println("********");

        int sum=0;

        for (int k : in)

            sum += k;

            System.out.println("Total is : "+sum);

        System.out.println("**********");

        Random random = new Random();
        int[] arrayNumbers = new int[5];

        for (int i = 0; i < arrayNumbers.length; i++) {
            int randomNumber = random.nextInt(1000);
            arrayNumbers[i] = randomNumber;
        }


        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println(arrayNumbers[i]);
        }

    }



}
