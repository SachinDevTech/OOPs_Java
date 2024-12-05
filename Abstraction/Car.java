// package Abstraction;

public class Car {

    // this is underlying implementation of with which user interacts
    private void createSpark() {
        System.out.println("Car SParked!");
    }

    private void changePistonPads() {
        System.out.println("Piston pads are changed!");
    }

    private void moveBreakPads() {
        System.out.println("Breakpads are moved!");
    }

    //user interacts with such methods
    public void turnOnCar() {
        createSpark();
    }

    public void brake() {
        moveBreakPads();
    }

    public void accelerate() {
        changePistonPads();
    }

}
