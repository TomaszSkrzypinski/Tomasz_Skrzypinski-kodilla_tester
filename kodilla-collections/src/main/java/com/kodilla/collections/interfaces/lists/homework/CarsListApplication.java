package com.kodilla.collections.interfaces.lists.homework;

import com.kodilla.collections.interfaces.Triangle;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarsListApplication {
    public static void main(String[] args) {
        List <Car> cars = new ArrayList <>();
        cars.add(new Fiat(58));
        cars.add(new Fiat(84));
        cars.add(new Ford(103));
        cars.add(new Ford(77));
        cars.add(new Ferrari(123));
        cars.add(new Ferrari(132));

        cars.remove(2);
        Ferrari ferrari = new Ferrari(123);
        cars.remove(ferrari); // To polecenie usunięcia nie działa. Czemu?

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        System.out.println();
        System.out.println(cars.size());

    }
}
