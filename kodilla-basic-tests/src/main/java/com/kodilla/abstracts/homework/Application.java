package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 8);
        Triangle triangle = new Triangle(10, 4,10,10);


        circle.surfaceArea();
        circle.circuit();
        rectangle.surfaceArea();
        rectangle.circuit();
        triangle.surfaceArea();
        triangle.circuit();
    }
}
