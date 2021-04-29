package fourthpackage;

public class ArrayPractice {

    public static void main(String[] args) {
try {
    String[] names = new String[5];
    names[0] = "Julia";
    names[1] = "banor";
    names[2] = "duli";
    names[3] = "nhy";
    names[4] = "kjh";
    //names[5] = "Jia";

    for(int i = 0; i<names.length; i++){
        System.out.println(names[i]);
    }

} catch (ArrayIndexOutOfBoundsException e){
    e.printStackTrace();
        }



        //System.out.println(names[1]);



    }

}
