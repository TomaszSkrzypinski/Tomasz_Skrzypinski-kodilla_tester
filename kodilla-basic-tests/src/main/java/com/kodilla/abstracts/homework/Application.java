package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 8);
        Triangle triangle = new Triangle(3, 4,6,5);


        circle.polePow();
        circle.obwód();
        rectangle.polePow();
        rectangle.obwód();
        triangle.polePow();
        triangle.obwód();
    }
}
