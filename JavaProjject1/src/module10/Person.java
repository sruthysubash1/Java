package module10;

public abstract class Person {

    //Attributes
    private String name;
    private int age;

    //Default constructor
    public Person() {
    }

    /* Initialize with name and age
       Name and age of the person
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Return name(getter)
    public String getName() {
        return this.name;
    }

    //Return age(getter)
    public int getAge() {
        return this.age;
    }

    //Update name(setter)
    public void setName(String newName) {
        this.name = newName;
    }

    //Update age(setter)
    public void setAge(int newAge) {
        this.age = newAge;
    }

    //Print person details(introduce method)
    public abstract void introduce();
}



