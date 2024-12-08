
public class UseLanguage {

    public static void main(String[] args) {

        // Non-Polymorphic way of using classes because we're creating reference for each class
        // Hindi hnd = new Hindi();
        // hnd.greetings();
        // English eng = new English();
        // eng.greetings();
        // French frn = new French();
        // frn.greetings();
        // Polymorphic way of using this concept
        //Common / Same Reference
        Language lng;

        //Used different version of same methods
        lng = new English();
        lng.greetings();

        lng = new Hindi();
        lng.greetings();

        lng = new French();
        lng.greetings();

    }
}
