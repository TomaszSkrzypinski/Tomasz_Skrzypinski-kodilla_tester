package com.kodilla.abstracts.homework;

public class Person {
    public static void main(String[] args) {

        String firstName;
        int age;
        String job;

        Policeman policeman = new Policeman(1500, "responsibilities1");
        Reporter reporter = new Reporter(1400, "responsibilities2");
        TaxiDriver taxiDriver = new TaxiDriver(1300, "responsibilities3");

        policeman.displayResponsibilities();
        reporter.displayResponsibilities();
        taxiDriver.displayResponsibilities();


    }
}
