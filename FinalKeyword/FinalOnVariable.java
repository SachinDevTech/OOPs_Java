// package FinalKeyword;

public class FinalOnVariable {

    private final double piValue = 3.14f;

    public void show() {
        //changed value of pi but it's not good... so we use final keyword in variable. And after declaring final this assignment in variable in won't be possible...

        //piValue = piValue + 10;

        System.out.println("The value of PI is: " + piValue);

    }
}
