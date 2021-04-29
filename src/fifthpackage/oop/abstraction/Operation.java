package fifthpackage.oop.abstraction;

import java.sql.SQLOutput;

public class Operation extends Restaurant implements Pizza{

    public static void main(String[] args) {
        Operation o = new Operation();
        o.troppings();
        o.size();
        o.bill();
        o.menu();
        o.cheese();
        int m = o.employee(8);
        System.out.println(m);

    }

    public int employee(int noe){
        return noe;
    }

    public void troppings(){
        System.out.println("Chicken");
    }

    public void size(){
        System.out.println("Medium Pizza");
    }

    public void cheese(){
        System.out.println("light cheese");
    }

    public void bill() {
        System.out.println("Free");
    }

}
