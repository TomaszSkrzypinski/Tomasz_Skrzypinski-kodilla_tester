package com.kodilla.inheritance.homework;

public class ViewAction {
    public static void main(String[] args) {

        Windows windows95 = new Windows(1995);
        OperatingSystem operatingSystem = new OperatingSystem(1980);
        Linux linux = new Linux(2000);

        operatingSystem.turnOff();
        windows95.turnOff(); //metoda nadpisana
        operatingSystem.turnOn();
        linux.turnOn(); // Metoda nadpisana

        operatingSystem.displaySystemYear();
        windows95.displaySystemYear();
        linux.displaySystemYear();

    }
}