package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @Test
    public void ifMethodGetBMICorrectlyCalculateBMI(Person person){
        Person person1 = new Person(1.66, 77.0);
        String actual = person1.getBMI();
        String expected = "Overweight";
        assertEquals(actual,expected);
    }
}