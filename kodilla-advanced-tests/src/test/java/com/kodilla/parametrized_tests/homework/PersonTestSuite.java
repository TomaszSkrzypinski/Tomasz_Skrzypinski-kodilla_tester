package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @Test
    @MethodSource(value = "provideStringsForTestingLength")
    public void ifMethodGetBMICorrectlyCalculateBMI(Person person, String expected) {
        String actual = person.getBMI();
        assertEquals(actual, expected);
    }

    public static Stream <Arguments> provideStringsForTestingLength() {
        Person person1 = new Person(1.66, 77);
        return Stream.of(
                Arguments.of(person1, "Overweight")

        );
    }
}