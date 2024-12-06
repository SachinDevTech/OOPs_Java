// package thisKeyword;

public class ThisStudent {

    private int roll;
    private String name;
    private double percent;

    public void setStudent(int r, String n, double per) {
        roll = r;
        name = n;
        percent = per;
    }

    public void showStudent() {
        System.out.println("Name: " + name + "\nRoll number: " + roll + "\nPercent: " + percent);
    }
}
