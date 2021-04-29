package sixthpackage;

public class EnumPractice {

    private Months months;

    public EnumPractice(Months months) {
        this.months = months;
    }

    public void work() {

        switch (months) {
            case January:
                System.out.println("Very cold");
                break;
            case February:
                System.out.println("cold");
                break;
            case March:
                System.out.println("Little bit cold");
                break;
            case April:
                System.out.println("Good");
                break;
            case May:
                System.out.println("Enjoy");
                break;
            case June:
            case July:
            case August:
                System.out.println("Summer");
                break;
            default:
                System.out.println("Winter");
        }

    }

    public static void main(String[] args) {
        EnumPractice w = new EnumPractice(Months.June);
        w.work();
    }


}

