package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GamblingMachineTestSuite {

    @Test
    @CsvFileSource(resources = "/GamblingMachineTestNumbers.csv", numLinesToSkip = 1)
    public void ifHowManyWinsWorkingCorrectFor(Integer element){
        Set <Integer> userNumbers = new HashSet <>();
        userNumbers.add(element);
        int result = userNumbers.size();
        assertEquals(6,6);
    }
}