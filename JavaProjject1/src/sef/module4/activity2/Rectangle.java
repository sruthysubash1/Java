package sef.module4.activity2;

public class Rectangle extends Shape{

    // TODO: Implement calculateArea and calculatePerimeter methods
    @Override
    public double calculateArea(double length, double breadth, double radius) {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter(double length, double breadth, double radius) {
        return 2 * (length + breadth);
    }
}
