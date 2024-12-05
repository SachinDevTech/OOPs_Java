// package GetterNsetter;

public class UseGetterSetter {

    public static void main(String[] args) {
        //create object
        GetterSetter gs = new GetterSetter();
        //assign values to instance variables using setters
        gs.setID(1000);
        gs.setName("Honey");
        gs.setPrice(280.00);

        //use getter fxns
        System.out.println("Product ID: " + gs.getID());
        System.out.println("Product Name: " + gs.getName());
        System.out.println("Product Price: " + gs.getPrice());

    }
}
