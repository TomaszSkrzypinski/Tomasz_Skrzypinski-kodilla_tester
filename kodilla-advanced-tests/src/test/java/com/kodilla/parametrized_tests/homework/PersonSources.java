package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

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

    static Stream <Arguments> providePersonsForTestingBmi() {
        PersonSources personSources1 = new PersonSources(new Person(1.66, 77), "Overweight");
        PersonSources personSources2 = new PersonSources(new Person(1.76, 77), "Normal (healthy weight)");
        PersonSources personSources3 = new PersonSources(new Person(1.56, 77), "Obese Class I (Moderately obese)");
        PersonSources personSources4 = new PersonSources(new Person(1.66, 57), "Normal (healthy weight)");
        PersonSources personSources5 = new PersonSources(new Person(1.66, 87), "Obese Class I (Moderately obese)");
        PersonSources personSources6 = new PersonSources(new Person(1.66, 0), "");
        PersonSources personSources7 = new PersonSources(new Person(0, 87), "");

        return Stream.of(
                Arguments.of(personSources1),
                Arguments.of(personSources2),
                Arguments.of(personSources3),
                Arguments.of(personSources4),
                Arguments.of(personSources5),
                Arguments.of(personSources6),
                Arguments.of(personSources7)
        );
    }

}
