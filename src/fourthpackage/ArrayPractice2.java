package fourthpackage;

public class ArrayPractice2 {

    public static void main(String[] args) {

        String [] str = new String[4];
try {
    str[0] = "Juwel";
    str[1] = "Real";
    str[2] = "Lina";
    str[3] = "Labib";
    //str[4] = "234";
}catch(ArrayIndexOutOfBoundsException e){
    //System.out.println("check your code");
    e.printStackTrace();
}
        for (int i=0; i<str.length; i++){

            System.out.println(str[i]);
        }




    }


}
