package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{


    public Rectangle(double base, double height) {
        super(base, height);
    }

    public void polePow() {
        System.out.println("Pole powierzchni prostokąta wynosi " + getSide_a()*getSide_b());
    }

    @Override
    public void obwód() {
        System.out.println("Obwód prostokąta wynosi " + 2*(getSide_a() + getSide_b()));

    }


}


