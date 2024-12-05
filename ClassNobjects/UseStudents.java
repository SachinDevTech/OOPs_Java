// package ClassNobjects;

public class UseStudents {

    public static void main(String[] args) {
        Students s; //makes an object reference of  s
        s = new Students(); //creates object in heap consists data
        s.name = "Sachin Kumar";
        s.rollNum = 01;
        s.percent = 81.5f;

        System.out.println("Name is: " + s.name);
        System.out.println("Roll Number: " + s.rollNum);
        System.out.println("Percent: " + s.percent);
    }
}
