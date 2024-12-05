// package Constructor;

public class User {

    private int accID;
    private String name;
    private double balance;

    //constructor called implicitly
    public User() {
        System.out.println("Constructor Called...");
        //So if user didn't provide any details then the default values will be provided to the data members:
        accID = 101;
        name = "Mukund Kumar";
        balance = 5333.50f;
    }

    // to show the data members - getter fxn
    public void getUserDetails() {
        System.out.println("Accound ID: " + accID);
        System.out.println("Name: " + name);
        System.out.println("Balance is: " + balance);
    }
}
