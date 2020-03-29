package com.kodilla.inheritance.homework;

public class OperatingSystem2 extends OperatingSystem {

    public OperatingSystem2(int year) {
        super(year);
    }

    public static void turnOff() {
        System.out.println("System is turned off + override");
    }
}
