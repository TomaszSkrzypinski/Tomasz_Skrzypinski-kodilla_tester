package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @Test
    public void ifMethodGetBMICorrectlyCalculateBMI(){
        Person person1 = new Person(1.66, 77);
        PersonSources personSources1 = new PersonSources(person1, "Overweight");
        String actual = personSources1.getPerson().getBMI();
        String expected = personSources1.getExpectedBMI();
        assertEquals(actual,expected);
    }
}