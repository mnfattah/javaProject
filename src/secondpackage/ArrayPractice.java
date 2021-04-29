package secondpackage;

public class ArrayPractice {

    public static void main(String[] args) {
        String[] team2 = {"Burhan", "Pria", "Tasnim", "Nurul"};
        for (int i = 0; i < team2.length; i++) {
            System.out.println(team2[i]);
        }
        System.out.println("********");

        int[] in = new int[6];
        in[0] = 1;
        in[1] = 2;
        in[2] = 3;
        in[3] = 4;
        in[4] = 5;
        in[5] = 6;


        //printing even numbers only


        for (int i = 0; i < in.length; i++) {

            if (in[i] % 2 == 0) {
                System.out.println(in[i]);
            }
        }

        System.out.println("******");

        int sum = 0;

        for (int k : in)
            sum = sum + k;
        System.out.println("Total is " + sum);

    }
}
