package com.kodilla.inheritance.homework;

public class VievAction {
    public static void main(String[] args) {

        OperatingSystem win95 = new OperatingSystem(95);
        OperatingSystem win98 = new OperatingSystem(98);
        OperatingSystem win2000 = new OperatingSystem(2000);

        OperatingSystem.turnOn();
        OperatingSystem3.turnOn(); // Metoda nadpisana.

        System.out.println(win95.getYear());
        System.out.println(win98.getYear()); // Problem. getYear pobiera rok dla obiektu win2000, a chcę, żeby pobierało dla win98.

        OperatingSystem.turnOff();
        OperatingSystem2.turnOff(); // Metoda nadpisana.
        win95.displaySystemYear();  // Problem. displaySystem Year wyświetla rok dla obiektu win2000, a chcę, żeby pobierało dla win95.
    }
}
