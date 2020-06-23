package com.kodilla.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car = new Car(4,4);

    @Test
    public void checkGetWheelsMethod() {
        int wheels = car.getWheels();
        Assertions.assertEquals(wheels, 4);
    }

    @Test
    public void checkGetSeatsMethod() {
        int seats = car.getSeats();
        Assertions.assertEquals(seats, 4);
    }
}