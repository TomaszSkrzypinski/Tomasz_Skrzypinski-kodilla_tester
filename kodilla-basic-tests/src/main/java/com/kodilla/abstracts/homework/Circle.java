package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    final double PI = 3.14;
    public Circle(double radius) {
        super(radius);
    }


    @Override
    public void surfaceArea() {
        System.out.println("Pole powierzchni koła wynosi: " + PI * getRadius()*getRadius());
    }

    @Override
       public void circuit() {
        System.out.println("Obwód koła wynosi: " + 2*PI*getRadius());
    }
}
