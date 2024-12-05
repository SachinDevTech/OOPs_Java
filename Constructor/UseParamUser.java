// package Constructor;

public class UseParamUser {

    public static void main(String[] args) {
        //object - 1
        ParamUser pu1 = new ParamUser(100, "Ashish", 45000.33);
        pu1.getUserDetails();

        //object - 2
        ParamUser pu2 = new ParamUser(101, "Mukund", 50000.50);
        pu2.getUserDetails();
    }
}
