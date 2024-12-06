// package thisKeyword;

public class ConstructorChaining {

    private int length, breadth, height;

    public ConstructorChaining(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    //Actual Constructor chaining that this side will be passed to all three args just by writing this(...);
    // This is taking only one args but distributing among all other args...
    public ConstructorChaining(int side) {
        this(side, side, side);
    }

    //Non-Parameterized Constructor call's the main Constrcutor has three args...
    public ConstructorChaining() {
        this(0, 0, 0);
    }

    public void showBox() {
        System.out.println("Length: " + length + " Breadth: " + breadth + " height: " + height);
    }

}
