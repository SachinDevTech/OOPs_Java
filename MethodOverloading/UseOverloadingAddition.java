// package MethodOverloading;

public class UseOverloadingAddition {

    public static void main(String[] args) {
        OverloadingAddition ola = new OverloadingAddition();
        System.out.println("Add integer values: " + ola.add(12, 12));
        System.out.println("Add string values: " + ola.add("Sachin ", "Kumar"));

    }
}
