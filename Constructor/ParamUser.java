// package Constructor;

public class ParamUser {

    private int accID;
    private String name;
    private double balance;

    //constructor called implicitly
    public ParamUser(int id, String n, double blnc) {
        accID = id;
        name = n;
        balance = blnc;
    }

    public void getUserDetails() {
        System.out.println("Accound ID: " + accID);
        System.out.println("Name: " + name);
        System.out.println("Balance is: " + balance);
    }
}
