package module10;

import java.util.List;

public class Employee extends Person {

    private String jobTitle;
    private String company;
    private double salary;

    //Default constructor
    public Employee()
    {
    }

    /**
     Constructor for initialize employee attributes.
     employee's job title
     company name
     employee's salary
     */
    public Employee(String jobTitle, String company, double salary)
    {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    /*
     Initializing Person and Employee attributes.
     Parameters - name,age,jobTitle,company,salary
     */
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    //Gets job title
    public String getJobTitle()
    {
        return jobTitle;
    }
    //Gets the company name
    public String getCompany()
    {
        return company;
    }
    //Gets the salary
    public double getSalary()
    {
        return salary;
    }
    //Set jobTitle
    public void setJobTitle(String newJobTitle)
    {
        jobTitle = newJobTitle;
    }
    // Set company name
    public void setCompany(String newCompany)
    {
        company = newCompany;
    }
    //Set salary
    public void setSalary(double newSalary)
    {
        salary = newSalary;
    }

    //Print employee details
    @Override
    public void introduce()
    {
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old");
        System.out.println("I am work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }

    //Method to find and return the name of the employee with the highest salary
    public String getHighestPaidEmp(List<Employee> employeeList) {

        Employee highest = employeeList.get(0);
        for (Employee employee : employeeList)
        {
            if (employee.getSalary() > highest.getSalary())
            {
                highest = employee;
            }
        }
        return highest.getName();
    }
}


