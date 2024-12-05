// package MethodOverloading;

public class OverloadingAddition {

    //Overloading based on the datatype
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double i, double j) {
        return i + j;
    }

    public String add(String s1, String s2) {
        return s1 + s2;
    }

    //overloading based on the number of parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public double add(double i, double j, double k) {
        return i + j + k;
    }

    public double add(double i, double j, double k, double l) {
        return i + j + k + l;
    }

    public String add(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }

    //based on the order of parameters
    public String add(int age, String name) {
        String s = "Age is: " + age + " and name is: " + name;
        return s;
    }

    public String add(String name, int age) {
        String s = "Name is: " + name + " and age is: " + age;
        return s;
    }
}
