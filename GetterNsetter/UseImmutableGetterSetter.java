// package GetterNsetter;

public class UseImmutableGetterSetter {

    public static void main(String[] args) {
        // we use constructor in entity class and passes args from driver class in such cases.
        ImmutableGetterSetter igs = new ImmutableGetterSetter(1111, "Maggie", 52.00);

        System.out.println("Product ID: " + igs.getID());
        System.out.println("Product Name: " + igs.getName());
        System.out.println("Product Price: " + igs.getPrice());

        System.out.println();

        //set name of product but price remained same
        igs.setName("Patanjali Noodles");
        System.out.println("Product ID: " + igs.getID());
        System.out.println("Product Name: " + igs.getName());
        System.out.println("Product Price: " + igs.getPrice());

    }
}
