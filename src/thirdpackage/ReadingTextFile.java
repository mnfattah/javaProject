package thirdpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFile {


    public static void main(String[] args) {
        String temp;
        String finalc = "";
        try {
            FileReader f1 = new FileReader("src/thirdpackage/real.txt");
            BufferedReader b1 = new BufferedReader(f1);

            while ((temp = b1.readLine()) != null) {

                {
                    if (temp.length() != 0)
                        finalc = finalc + temp + "\n";
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(finalc);
    }
}
