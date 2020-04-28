package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {

    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (numbers.size() != 6) {
            throw new InvalidNumbersException();
        }

        if (numbers.stream().anyMatch(number -> number < 1)) {
            throw new InvalidNumbersException();
        }
    }

    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }

    public static void main(String[] args) throws InvalidNumbersException {
        GamblingMachine machine = new GamblingMachine();

        Integer element1 =10;
        Integer element2 =9;
        Integer element3 =48;
        Integer element4 =7;
        Integer element5 =6;
        Integer element6 =1;

        Set<Integer> userNumbers = new HashSet <>();
        userNumbers.add(element1);
        userNumbers.add(element2);
        userNumbers.add(element3);
        userNumbers.add(element4);
        userNumbers.add(element5);
        userNumbers.add(element6);

        System.out.println(machine.howManyWins(userNumbers));

    }
}