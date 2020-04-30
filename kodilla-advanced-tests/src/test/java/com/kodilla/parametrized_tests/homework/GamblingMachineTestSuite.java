package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GamblingMachineTestSuite {

    GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineTestNumbers.csv", numLinesToSkip = 1)
    //test dla prawidłowej wielkości zbioru userNumbers
    public void checkHowManyWinsMethodWorkingCorrectForCorrectUserNumbersSize(Integer integer1, Integer integer2, Integer integer3, Integer integer4, Integer integer5, Integer integer6, Integer integer7) throws InvalidNumbersException {
        Set <Integer> userNumbers = new HashSet <>();
        userNumbers.add(integer1);
        userNumbers.add(integer2);
        userNumbers.add(integer3);
        userNumbers.add(integer4);
        userNumbers.add(integer5);
        userNumbers.add(integer6);
        boolean expected = true;
        boolean actual = false;
        int result = machine.howManyWins(userNumbers);
        if(result>=0 && result <=6){
            actual = true;}
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineTestNumbers.csv", numLinesToSkip = 1)
    //test dla nieprawidłowej wielkości zbioru userNumbers (pięć liczb zamiast sześciu)
    public void checkHowManyWinsMethodCorrectThrowExceptionForUncorrectUserNumbersSize(Integer integer1, Integer integer2, Integer integer3, Integer integer4, Integer integer5, Integer integer6, Integer integer7) throws InvalidNumbersException {
        Set <Integer> userNumbers = new HashSet <>();
        userNumbers.add(integer1);
        userNumbers.add(integer2);
        userNumbers.add(integer3);
        userNumbers.add(integer4);
        userNumbers.add(integer5);

        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineTestNumbers.csv", numLinesToSkip = 1)
    //test dla nieprawidłowej wartości liczb w zbiorze userNumbers (liczby mniejsze od jeden)
    public void checkHowManyWinsMethodCorrectThrowExceptionForUncorrectNumbersInUserNumbersSet(Integer integer1, Integer integer2, Integer integer3, Integer integer4, Integer integer5, Integer integer6, Integer integer7) throws InvalidNumbersException {
        Set <Integer> userNumbers = new HashSet <>();
        userNumbers.add(integer1);
        userNumbers.add(integer2);
        userNumbers.add(integer3);
        userNumbers.add(integer4);
        userNumbers.add(integer5);
        userNumbers.add(integer7);
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));
    }
}