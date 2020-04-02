package com.kodilla.abstracts.homework;

public class Person {

    String firstName;
    String job;
    int age;

    public Person(String firstName, int age, String job, int salary, String responsibilities){
       this.firstName = firstName;
       this.age = age;
       this.job = job;
   }

    public void displayInformation() {
        System.out.print("His name is " + firstName + ", he is " + age + " years old and works as " + job + ".");
    }

    public static void main(String[] args) {

        Policeman policeman1 = new Policeman(1100, "reasponsibilities1");
        Reporter reporter1 = new Reporter(1200,"responsibilities2");
        TaxiDriver taxiDriver1 = new TaxiDriver(1000, "responsibilities3");
        Person policeman = new Person("Adam",34,"policeman",1100, "responsibilities1");
        Person reporter = new Person("Jan",52,"reporter", 1150,"responsibilities2");
        Person taxiDriver = new Person("Krzysztof",41,"taxidriver",998,"responsibilities3");

        policeman.displayInformation();
        policeman1.displayResponsibilities();
        reporter.displayInformation();
        reporter1.displayResponsibilities();
        taxiDriver.displayInformation();
        taxiDriver1.displayResponsibilities();

    }
}

