package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarApplicationTestSuite {

    @Test
    public void shouldCreateRandomAnimal() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("choseCar");
        //When
        String carType = car.getCarType();
        System.out.println(carType);
        //Then
        List <String> possibleCarTypes = Arrays.asList("SUV", "cabrio", "sedan");
        Assertions.assertTrue(possibleCarTypes.contains(carType));
    }
}
