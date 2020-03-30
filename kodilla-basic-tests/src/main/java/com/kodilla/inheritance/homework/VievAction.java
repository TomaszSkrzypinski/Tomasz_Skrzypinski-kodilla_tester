package com.kodilla.inheritance.homework;

public class VievAction {
    public static void main(String[] args) {

        OperatingSystem win95 = new OperatingSystem(95);
        OperatingSystem win98 = new OperatingSystem(98);
        OperatingSystem win2000 = new OperatingSystem(2000);

        //OperatingSystem.turnOn();
        //Linux.turnOn(); // Metoda nadpisana.

        System.out.println(win95.getYear());
        System.out.println(win95.getYear());

       // OperatingSystem.turnOff();
       // Windows.turnOff(); // Metoda nadpisana.
        win2000.displaySystemYear();

    }
}