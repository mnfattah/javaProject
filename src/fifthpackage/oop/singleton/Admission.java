package fifthpackage.oop.singleton;

public class Admission {

    private static Admission a=null;

    private Admission(){}

    public static Admission getInstance(){
        if (a== null){
            a = new Admission();
            }
        return a;
    }
public void placeOfAdmission(){
    System.out.println("jhgcfkhvb");
}
}
