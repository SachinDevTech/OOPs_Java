import java.util.Scanner;

public class StaticBlockUserAccount {

    private int accID;
    private String name;
    private double balance;

    private static double rateOfInterest;

    static {
        System.out.println("Enter the Rate of Interest: ");
        Scanner sc = new Scanner(System.in);
        rateOfInterest = sc.nextDouble();
    }

    public StaticBlockUserAccount(int id, String n, double bal) {
        accID = id;
        name = n;
        balance = bal;
    }

    // Non-static method to access instance variables
    public void getUserDetails() {
        System.out.println("AccID: " + accID + 
                           "\nName: " + name + 
                           "\nBalance: " + balance + 
                           "\nRate of Interest: " + rateOfInterest);
    }
}
