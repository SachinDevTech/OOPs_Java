
abstract class Instrument {

    // public void sound() {
    // }
    abstract public void sound();
}

class Violin extends Instrument {

    public void sound() {
        System.out.println("Violin Played...");
    }
}

class Guitar extends Instrument {

    public void sound() {
        System.out.println("Guitar Played...");
    }
}
