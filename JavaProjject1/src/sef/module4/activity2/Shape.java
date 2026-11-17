package sef.module4.activity2;

public abstract class Shape {
    public String color;

    public Shape() {
    }

    // TODO: Add abstract method calculateArea(double length, double breadth, double radius) with return type as double
    public abstract double calculateArea(double length, double breadth, double radius);

    // TODO: Add abstract method calculatePerimeter(double length, double breadth, double radius) with return type as double
    public abstract double calculatePerimeter(double length, double breadth, double radius);

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }
}

