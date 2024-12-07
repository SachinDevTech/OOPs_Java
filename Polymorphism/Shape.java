// package Polymorphism;

public class Shape {

    public void area(double radius) {
        //area = PI * r * r
        double ans = (Math.PI) * Math.pow(radius, 2);
        System.out.println("Area of circle is: " + ans);
    }

    public void area(int side) {
        int ans = side * side;
        System.out.println("Area of square is: " + ans);
    }

    public void area(int length, int breadth) {
        int ans = 2 * length * breadth;
        System.out.println("Area of rectangle is: " + ans);
    }
}
