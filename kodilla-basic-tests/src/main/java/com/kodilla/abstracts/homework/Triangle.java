package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle(double base, double height, double sideA, double sideB) {
        super(base, height, sideA, sideB);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Pole powierzchni trójkata wynosi " + (getBase()*getHeight())/2);
    }

    @Override
    public void circuit() {
        System.out.println("Obwód trójkąta wynosi " + (getBase() + getSideA() + getSideB()));// Metoda nie sprawdza, czy trójkąt o takich bokach rzeczywiście istnieje, ale nie o to w tym zadaniu chodzi.
    }
}
