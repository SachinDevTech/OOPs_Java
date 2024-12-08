
public class Language {

    public void greetings() {
        // Left empty and we are gonna define the method body in inherited class
    }
}

class Hindi extends Language {

    public void greetings() {
        System.out.println("Namaste Ji...");
    }
}

class English extends Language {

    public void greetings() {
        System.out.println("Good Morning...");
    }
}

class French extends Language {

    public void greetings() {
        System.out.println("Bon Jour...");
    }
}
