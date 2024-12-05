public class UseEncapsulationStudent {

    public static void main(String[] args) {

        //set values of students
        //student-1
        EncapsulationStudent es1 = new EncapsulationStudent();
        es1.setStudent(101, "Gaurav Yadav", 81.5);

        //student-2
        EncapsulationStudent es2 = new EncapsulationStudent();
        es2.setStudent(102, "Gulshan Yadav", 89.6);

        //get values of studnets
        es1.getStudent();
        System.out.println();
        es2.getStudent();
    }
}
