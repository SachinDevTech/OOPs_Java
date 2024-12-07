// package MethodOverriding;

class Fruit {

    public void taste() {
        System.out.println("Fruits are Sweet!");
    }
}

public class Grapes extends Fruit{
    // this method is overridden
    public void taste() {
        System.out.println("Grapes are Citrus in Taste!");
    }
}