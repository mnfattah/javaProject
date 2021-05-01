package firstpackage;

import java.util.Arrays;

public class AnagramPractice {

    public static void isAnagram(String a, String b){

       char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean isanagram = Arrays.equals(c1,c2);
        System.out.println(isanagram);

        if(isanagram){
            System.out.println(a + " and " + b + " are anagram");
        }
        else{
            System.out.println(a + " and " + b + " are not anagram");
        }

    }

    public static void main(String[] args) {
        isAnagram("duck", "cuk");

    }
}
