package fifthpackage.oop.inheritance;

public class Orange extends Banana {


    public static void main(String[] args) {
        Orange o = new Orange();
        o.glass();
        o.cellphone();
    }

    @Override
    public void glass() {
        System.out.println("green glass");
    }

    public void paper(){
        System.out.println("the paper is green");
    }
}
