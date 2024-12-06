
public class StaticAccessedByStatic {
    //int a = 10; // this is just an instance variable and in this case we need to make an object of this class.

    // but if we use static keyword then can be accessed directly by psvm
    // we can also encapsulate it. just for analogy
    static int a = 20;

    public static void main(String[] args) {
        //Object
        // StaticAccessedByStatic sabs = new StaticAccessedByStatic();
        // System.out.println(sabs.a);

        // By the impact of static keyword...
        System.out.println("The vakue of a is: " + a);
    }
}
