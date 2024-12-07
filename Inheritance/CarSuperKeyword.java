
public class CarSuperKeyword extends VehicleSuperKeyword {

    public CarSuperKeyword() {
        //this we use to call constructor of parent class - in case of parameterized constructor but in case of non-parameterized constructor java automatically writes super(); in child class and call's the constructor available in parent class.

        
        // super("Sachin Kumar");
        super();
        System.out.println("Car's constructor called...");
    }
}
