package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.ShapeUtils;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);

    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int a = random.nextInt( 85) +1;
        if (drawnCarKind == 0)
            return new Fiat(a);
        else if (drawnCarKind == 1)
            return new Ferrari(a);
        else
            return new Ford(a);
    }


}
