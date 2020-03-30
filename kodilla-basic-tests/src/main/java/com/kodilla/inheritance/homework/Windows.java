package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int year) {
        super(year);
    }

    public void turnOff() {
        System.out.println("System is turned off + override");
    }
}
