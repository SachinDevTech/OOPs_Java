
public class UseParent {
    //So in this example below you can see that p.show is same but p.display has different forms because when object is of parent and non static then parent's method is called and when object is of child and method is non static then child's method will be called. So this is basically an example of Runtime Polymorphism

    public static void main(String[] args) {
        Parent p = new Parent();
        p.show(); //Static method but reference of parent calls parents show()
        p.display(); // Non static method but the object is of parent so, parent's display will be executed

        p = new Child(); // Parent reference has Child class's object
        p.show(); //Static method but reference of parent calls parents show()
        p.display();// Non static method but the object is of parent so, child's display will be executed
    }
}
