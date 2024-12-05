// package ArgumentsPassing;

public class ArgsPassByValue {

    public static void increment(int x, int y) {
        x = x + 10;
        y = y + 10;
    }

    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("Before inc:- " + "X is: " + x + " Y is: " + y);
        increment(x, y);
        System.out.println("After inc:- " + "X is: " + x + " Y is: " + y);
    }
}
