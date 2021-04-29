package fifthpackage.oop.encapsulation;

public class Hospital {
    public static void main(String[] args) {
        Patient p = new Patient();

        p.setname("Juwel");
        p.setage(35);
        p.setAddress("8100 Russell Rd");
        p.setContactNo(5715026145L);

        System.out.println(p.getname());
        System.out.println(p.getage());
        System.out.println(p.getAddress());
        System.out.println(p.getContactNo());
    }

}
