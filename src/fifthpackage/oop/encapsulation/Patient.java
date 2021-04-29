package fifthpackage.oop.encapsulation;

public class Patient {

    private String name;
    private int age;
    private String address;
    private long contactNo;

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }


    public int getage(){
        return age;
    }


    public void setage(int age){
        this.age=age;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public long getContactNo(){
        return contactNo;
    }

    public void setContactNo(long contactNo){
        this.contactNo = contactNo;
    }
}

