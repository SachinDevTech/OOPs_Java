// package GetterNsetter;
//Entity class
public class GetterSetter {

    //instance variables
    private int productID;
    private String name;
    private double price;

    //setters
    public void setID(int id) {
        productID = id;
    }

    public void setName(String n) {
        name = n;
    }

    public void setPrice(double p) {
        price = p;
    }

    //getters
    public int getID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
