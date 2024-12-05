// package GetterNsetter;

public class ImmutableGetterSetter {

    //instance variables
    private int productID;
    private String name;
    private double price;

    //setter is only for name and we made productID and Price immutable.
    public ImmutableGetterSetter(int pID, String n, double p) {
        productID = pID;
        name = n;
        price = p;
    }

    public void setName(String n) {
        name = n;
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
