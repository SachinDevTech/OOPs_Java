package StaticKeyword;

class Emp {

    private int age;
    private String name;
    //when all employees are of Amazon then why we should create multiple copies. It helps in rmoving redundancy by creating itself for once. So we'll use static in front of it. And we can get as many copies as many objects we create.
    private static String compnanyName = "Amazon";

    //Constructor to pass data in data members
    public Emp(int umra, String naam) {
        age = umra;
        name = naam;
    }

    public void display() {
        System.out.println("Age is: " + age);
        System.out.println("Name is: " + name);
        System.out.println("Compnay is: " + compnanyName);
    }

}

public class StaticConcept2 {

    public static void main(String[] args) {
        Emp e1 = new Emp(21, "Sachin Kumar");
        Emp e2 = new Emp(21, "Mukund Kumar");
        Emp e3 = new Emp(21, "Gulshan Kumar");

        e1.display();
        e2.display();
        e3.display();
    }
}
