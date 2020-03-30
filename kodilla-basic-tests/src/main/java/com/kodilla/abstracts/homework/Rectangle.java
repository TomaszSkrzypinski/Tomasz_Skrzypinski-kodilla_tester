package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{


    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    public void surfaceArea() {
        System.out.println("Pole powierzchni prostokąta wynosi " + getSideA()* getSideB());
    }

    @Override
    public void circuit() {
        System.out.println("Obwód prostokąta wynosi " + 2*(getSideA() + getSideB()));

    }


}


