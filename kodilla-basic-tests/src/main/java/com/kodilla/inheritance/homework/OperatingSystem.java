package com.kodilla.inheritance.homework;

public class OperatingSystem {

       private static int year;

    public OperatingSystem(int year) {
       this.year = year;
    }

    public static void turnOn() {
        System.out.println("System is turned on");
    }

    public static void turnOff() {
        System.out.println("System is turned off");
    }

    public static void displaySystemYear() {
        System.out.println("System year is: " + year);
    }

    public int getYear() {
        return year;
    }



}
