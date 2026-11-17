package sef.module4.activity2;

public class AbstractActivity {
    public static void main(String args[]) {
        // TODO: Create a Rectangle object, set color to "Blue", and print the color
        Shape rectangle = new Rectangle();
        rectangle.setColor("Blue");
        System.out.println("Rectangle Color: " + rectangle.getColor());

        // TODO: Print the area and perimeter of the rectangle (using length = 2, breadth = 4, radius = 0)
        System.out.println("Rectangle Area: " + rectangle.calculateArea(2, 4, 0));
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter(2, 4, 0));

        // TODO: Create a Circle object, set color to "Pink", and print the color
        Shape circle = new Circle();
        circle.setColor("Pink");
        System.out.println("Circle Color: " + circle.getColor());

        // TODO: Print the area and perimeter of the circle (using length = 0, breadth = 0, radius = 5)
        System.out.println("Circle Area: " + circle.calculateArea(0, 0, 5));
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter(0, 0, 5));
    }
}
