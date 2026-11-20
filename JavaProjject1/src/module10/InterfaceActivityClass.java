package module10;

public class InterfaceActivityClass {

    public static void main(String[] args) {

        Vehicle bike = new Bike();
        //Calling bike methods
        bike.start();
        bike.stop();

        System.out.println("----------------");

        Vehicle car = new Car();
        //Calling car methods
         car.start();
         car.stop();
    }
}
