// package StaticKeyword;

public class UseStaticBlockUserAccount {

    public static void main(String[] args) {
        StaticBlockUserAccount user1 = new StaticBlockUserAccount(101, "Gaurav Yadav", 200.36);
        StaticBlockUserAccount user2 = new StaticBlockUserAccount(101, "Hrishabh Yadav", 2000.00);

        user1.getUserDetails(); //same rate of Interest
        user2.getUserDetails(); //same rate of Interest
    }
}
