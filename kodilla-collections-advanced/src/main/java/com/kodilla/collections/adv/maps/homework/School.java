package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List <Integer> schools = new ArrayList <>();
    String name;

    public School(String name, int... klas) {
        for(int klass : klas)
            this.schools.add(klass);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getStudentsSum() {
        int sum = 0;
        for (int klass : schools)
            sum += klass;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "schools=" + schools +
                '}';
    }
}
