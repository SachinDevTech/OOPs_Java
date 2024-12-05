
import java.util.ArrayList;

// package ArgumentsPassing;
public class ArgsPassByReference {

    public static void change(ArrayList<Integer> list) {
        list = new ArrayList<>();
        list.add(40);
        list.add(50);

    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        System.out.println("Before Change: " + myList);
        change(myList);
        System.out.println("After Change: " + myList);
    }
}
