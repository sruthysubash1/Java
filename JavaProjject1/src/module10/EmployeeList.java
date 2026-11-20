package module10;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {


    public static void main(String[] args) {

        //Employee objects
        Employee employee1 = new Employee("QA Engineer", "Cognizant", 4500.0);
        employee1.setName("Sruthy");

        Employee employee2 = new Employee("Java Developer", "Cognizant", 5200.0);
        employee2.setName("Rony");

        Employee employee3 = new Employee("Automation Lead", "Cognizant", 6800.0);
        employee3.setName("Meera");

        Employee employee4 = new Employee("Business Analyst", "TCS", 4900.0);
        employee4.setName("Arjun");

        Employee employee5 = new Employee("DevOps Engineer", "Wipro", 6100.0);
        employee5.setName("Neha");

        //Employee list
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        //Print highest salary
        System.out.println("The Employee whose salary is the highest is :" + employee1.getHighestPaidEmp(employeeList));
    }
}