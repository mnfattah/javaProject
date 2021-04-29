package fifthpackage.oop.singleton;

public class AdmissionExecution {

    public static void main(String[] args) {
        Admission b = Admission.getInstance();
        b.placeOfAdmission();
    }

}
