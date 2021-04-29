package fifthpackage.oop.polymorphism;

public class Math {

    public static void main(String[] args) {
        int a = addition(4,5);
        System.out.println(a);

        int b = addition(2,3,4);
        System.out.println(b);

    }

    public static int addition(int x, int y){
        return x+y;
    }

    public static int addition(int x, int y, int z){
        return x+y+z;
    }

}
