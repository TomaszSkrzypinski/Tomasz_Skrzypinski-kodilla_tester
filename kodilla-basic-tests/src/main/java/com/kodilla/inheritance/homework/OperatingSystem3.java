package com.kodilla.inheritance.homework;

public class OperatingSystem3 extends OperatingSystem2 {

    public OperatingSystem3(int year) {
        super(year);
    }

    public static void turnOn() {
        System.out.println("System is turned on + override");
    }
}
