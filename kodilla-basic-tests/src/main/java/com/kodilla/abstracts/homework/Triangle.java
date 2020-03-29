package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle(double base, double height, double side_c, double side_d) {
        super(base, height, side_c, side_d);
    }

    @Override
    public void polePow() {
        System.out.println("Pole powierzchni trójkata wynosi " + (getBase()*getHeight())/2);
    }

    @Override
    public void obwód() {
        System.out.println("Obwód trójkąta wynosi " + (getBase() + getSide_c() + getSide_d()));// Metoda nie sprawdza, czy trójkąt o takich bokach rzeczywiście istnieje, ale nie o to w tym zadaniu chodzi.
    }
}
