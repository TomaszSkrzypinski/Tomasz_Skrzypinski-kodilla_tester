package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Fiat fiat = new Fiat(75);
        Ford ford = new Ford(75);
        Ferrari ferrari = new Ferrari(75);

        doRace(fiat);
        doRace(ferrari);
        doRace(ford);
    }

    public static void doRace (Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
