package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle(double base, double height, double sideC, double sideD) {
        super(base, height, sideC, sideD);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Pole powierzchni trójkata wynosi " + (getBase()*getHeight())/2);
    }

    @Override
    public void circuit() {
        System.out.println("Obwód trójkąta wynosi " + (getBase() + getSideC() + getSideD()));// Metoda nie sprawdza, czy trójkąt o takich bokach rzeczywiście istnieje, ale nie o to w tym zadaniu chodzi.
    }
}
