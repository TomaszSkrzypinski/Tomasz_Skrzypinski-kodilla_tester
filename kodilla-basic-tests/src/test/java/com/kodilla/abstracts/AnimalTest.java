package com.kodilla.abstracts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Dog dog = new Dog();

    @Test
    public void checkGetNumberOfLegs(){
        int legs = dog.getNumberOfLegs();
        Assertions.assertEquals(legs,4);
    }
}