package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux(int year) {
        super(year);
    }

    public void turnOn() {
        System.out.println("System is turned on + override");
    }
}
