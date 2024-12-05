// package MethodOverloading;

public class UseOverloadingAddition {

    public static void main(String[] args) {
        OverloadingAddition ola = new OverloadingAddition();
        // based on datatype
        // System.out.println("Add integer values: " + ola.add(12, 12));
        // System.out.println("Add string values: " + ola.add("Sachin ", "Kumar"));

        //based on number of params
        System.out.println(ola.add(12, 12, 12, 12));

        //based on order of params
        System.out.println(ola.add(22, "Sachin Kumar"));
        System.out.println(ola.add("Gaurav Kumar", 22));

    }
}
