package fifthpackage.oop.inheritance;

public class Banana extends Apple{

    public static void main(String[] args) {
        Banana b = new Banana();
        b.cellphone();
        b.glass();



        Apple a = new Apple();
        a.glass();

    }

    @Override
    public void glass() {
        System.out.println("My glass is broken");
    }

    public void cellphone (){
        System.out.println("I am using cell phone");
    }
}
