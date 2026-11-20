package module10;

public class AbstractActivity {

    public static void main(String[] args) {

        //Creating employee object
        Employee employee = new Employee("Sruthy", 25, "QA Engineer", "Cognizant", 4500.0);

        //Calling introduce
        employee.introduce();

        //Creating student Objects
        Students student = new Students();
        student.setName("David");
        student.setAge(21);
        student.setSchoolName("Riga Technical University");

        //Calling introduce
        student.introduce();
    }
}
