
public class VehicleSuperKeyword {

    //As we pass argument to this constructor child class throw an error and say no default means no non-parameterized constructor is available so we use super keyword and pass the args...
    //parameterized constructor
    public VehicleSuperKeyword(String type) {
        System.out.println("Vehicle's Parameterized Constructor Called..." + type);
    }

    // non-parameterized constructor 
    public VehicleSuperKeyword() {
        System.out.println("Vehicle's Non-Parameterized Constructor Called...");
    }
}
