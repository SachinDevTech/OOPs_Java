// package StaticKeyword;

class MyMath {

    // // in this class there is not data member
    // public int add(int a, int b) {
    //     return a + b;
    // }
    public static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethods {

    public static void main(String[] args) {
        // //reference
        // MyMath m;
        // //object creation
        // m = new MyMath();

        //System.out.println("Sum is: " + m.add(10, 20));

        // But but but... As there is not data members in class why we make object of that class, we can save memory by declaring our MyMath method as Static. Thus we dont need to make an object.
        System.out.println("Static method sum is: " + MyMath.add(10, 30));
    }
}
