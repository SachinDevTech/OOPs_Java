// package StaticKeyword;

class Demo {

    int a; // java creates a copy at each object creation
    static int b; // java only creates a copy at the time of class usage without waiting for object creation...
}

public class StaticConcept {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        // Assign values to a and see that copies created or not?
        d1.a = 10;
        d2.a = 20;
        d3.a = 30;
        System.out.println("d1.a= " + d1.a + "\n" + "d2.a= " + d2.a + "\n" + "d3.a= " + d3.a);

        // what if we we assign likewise for b :-> O/P: 30 because 10 will go in b and in next step 20 will go and then 30 but finally 30 is stored in a single variable (b) and copy is not created.
        d1.b = 10;
        d2.b = 20;
        d3.b = 30;
        System.out.println("d1.b= " + d1.b + "\n" + "d2.b= " + d2.b + "\n" + "d3.b= " + d3.b);

    }

}
