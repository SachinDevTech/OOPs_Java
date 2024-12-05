class EncapsulationStudent {

    //data members/ instance variables
    private int rollNum;
    private String name;
    private double percent;

    //methods: getter and setter
    public void setStudent(int r, String n, double p) {
        //What is the benefit of encapsulation? We can apply conditions on the data coming from the user.
        //For Example:

        /*if (rollNum < 0) {
            System.out.println("Roll Number cannot be nagative!");
        } else {
            rollNum = r;
        }*/
        // if no need of applying condition then other instance varibales can be defined like this.
        rollNum = r;
        name = n;
        percent = p;
    }

    public void getStudent() {
        System.out.println("Name is: " + name);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Percent: " + percent);
    }

}
