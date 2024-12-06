// package StaticKeyword;

class Data {

    //if we create a non static instance variable and tried to access in static block, will through an error as they are not accessible...
    static {
        System.out.println("First Static Block called...");
    }
    static int number = 10;

    // this static data member can be used by static block
    static {
        System.out.println("Second Static Block called..." + number);
    }

    public Data() {
        System.out.println("Constructor Called...");
    }

    public static void show() {
        System.out.println("Show method called...");
    }
}

public class StaticBlock {

    public static void main(String[] args) {

        Data.show();// Even by using this Static blcok will be called and then show method

        Data d1 = new Data();
        Data d2 = new Data();
        Data d3 = new Data();

    }
}
