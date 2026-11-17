package sef.module4.activity2;

    public class InheritanceActivity {

        public static void main(String[] args) {

            // TODO: Create Person_I object myPerson and set name as "Sarah Johnson" and age as 21
            Person_I myPerson = new Person_I();
            myPerson.setName("Sarah Johnson");
            myPerson.setAge(21);

            System.out.println("-----------------------------");

            // TODO: Create Employee_I object myEmployee and

            // set salary as 70000.00, title as "Developer", age as 32 and name as "Shawn Cun"
            Employee_I myEmployee = new Employee_I();
            myEmployee.setSalary(70000.00);
            myEmployee.setTitle("Developer");
            myEmployee.setAge(32);
            myEmployee.setName("Shawn Cun");


            // Print Info using Employee object

            System.out.println("-----------------------------");


            // TODO: Uncomment the lines below once myEmployee is created



        System.out.println("Employee's Name is   : " + myEmployee.getName());

        System.out.println("Employee's Age is    : " + myEmployee.getAge());

        System.out.println("Employee's Title is  : " + myEmployee.getTitle());

        System.out.println("Employee's Salary is : " + myEmployee.getSalary());



            // Print Info using Person object

            System.out.println("-----------------------------");

            // TODO: Uncomment the lines below once myPerson is created

        System.out.println("Person's Name is    : " + myPerson.getName());

        System.out.println("Person's Age is     : " + myPerson.getAge());


        }

    }


