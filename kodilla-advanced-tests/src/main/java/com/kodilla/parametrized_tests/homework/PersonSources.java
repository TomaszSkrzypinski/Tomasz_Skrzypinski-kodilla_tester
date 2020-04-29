package com.kodilla.parametrized_tests.homework;

import java.util.stream.Stream;

public class PersonSources {

    private Person person;
    private String expectedBMI;

    public PersonSources(Person person, String expectedBMI) {
        this.person = person;
        this.expectedBMI = expectedBMI;
    }

    public Person getPerson() {
        return person;
    }

    public String getExpectedBMI() {
        return expectedBMI;
    }

    Person person1 = new Person(1.66, 77);
    Person person2 = new Person(1.76, 77);
    Person person3 = new Person(1.56, 77);
    Person person4 = new Person(1.66, 57);
    Person person5 = new Person(1.66, 87);
    Person person6 = new Person(1.66, 0);
    Person person7 = new Person(0, 87);

    PersonSources personSources1 = new PersonSources(person1, "Overweight");
    PersonSources personSources2 = new PersonSources(person2, "Normal (healthy weight)");
    PersonSources personSources3 = new PersonSources(person3, "Obese Class I (Moderately obese)");
    PersonSources personSources4 = new PersonSources(person4, "Normal (healthy weight)");
    PersonSources personSources5 = new PersonSources(person5, "Obese Class I (Moderately obese)");
    PersonSources personSources6 = new PersonSources(person6, "");
    PersonSources personSources7 = new PersonSources(person7, "");

}
