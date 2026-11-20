package module10;

public class Students extends Person{

    //Default constructor
    public Students()
    {
    }

    private String schoolName;

    public Students(String schoolName)
    {
        this.schoolName = schoolName;
    }

    //Getter for school name
    public String getSchoolName() {
        return schoolName;
    }
    //Setter for school name
    public void setSchoolName(String newSchoolName) {
        schoolName = newSchoolName;
    }

    /** Constructor initializing person details and school name.
       Student name, age and school name
     */
    public Students(String name, int age, String schoolName) {
        setName(name);
        setAge(age);
        this.schoolName = schoolName;
    }

    //Print details
    @Override
    public void introduce() {
        System.out.println("I am study in university " + schoolName);
    }


}
