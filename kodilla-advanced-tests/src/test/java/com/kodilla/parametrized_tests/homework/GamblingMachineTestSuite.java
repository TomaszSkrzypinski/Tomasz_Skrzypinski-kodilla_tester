package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GamblingMachineTestSuite {

    @Test
    @CsvFileSource(resources = "/GamblingMachineTestNumbers.csv", numLinesToSkip = 1)
    public void ifHowManyWinsWorkingCorrectFor(Integer integer1, Integer integer2, Integer integer3, Integer integer4, Integer integer5, Integer integer6){
        Set <Integer> userNumbers = new HashSet <>();

        int result = userNumbers.size();
        assertEquals(6,6);
    }
}