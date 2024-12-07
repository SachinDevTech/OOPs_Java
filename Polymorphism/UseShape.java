// package Polymorphism;

public class UseShape {

    public static void main(String[] args) {
        Shape sp = new Shape();
        //if type doesn't exaclty match then java does type conversion to the next nearest datatype
        //For ex:-

        sp.area('A'); //ASCII -> A = 65 => 65*65 = 4225
        sp.area(12);
        sp.area(12.12);
        sp.area(12, 12);
    }
}
