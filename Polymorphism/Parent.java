// Example implements Early Binding and Late Binding
public class Parent {

    public static void show() {
        System.out.println("Parent show is called...");
    }

    public void display() {
        System.out.println("Parent display is called...");
    }
}

class Child extends Parent {

    public static void show() {
        System.out.println("Child show is called...");
    }

    public void display() {
        System.out.println("Child display is called...");
    }
}
