package com.kodilla.abstracts.homework;

public class Person {

    String firstName;
    Job job;
    int age;

    public Person(String firstName, int age, Job job){
       this.firstName = firstName;
       this.age = age;
       this.job = job;
   }

    public void displayInformation() {
        System.out.println("His name is " + firstName + ", he is " + age + " years old and his duty is " + job.responsibilities + ".");
    }

    public static void main(String[] args) {

        Person policeman = new Person("Adam",34,new Policeman(1100,"responsibilities1"));
        Person reporter = new Person("Jan",52,new Reporter(1200,"responsibilities2"));
        Person taxiDriver = new Person("Krzysztof",41,new TaxiDriver(990,"responsibilities3"));

        policeman.displayInformation();
        reporter.displayInformation();
        taxiDriver.displayInformation();

    }
}

