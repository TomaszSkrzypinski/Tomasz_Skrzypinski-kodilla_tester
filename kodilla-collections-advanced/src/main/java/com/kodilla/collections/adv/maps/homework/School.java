package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List <Integer> studentsNumbers = new ArrayList <>();
    private String name;

    public School(String name, int... studentsInClass) {
        for(int students : studentsInClass)
            this.studentsNumbers.add(students);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getStudentsSum() {
        int sum = 0;
        for (int students : studentsNumbers)
            sum += students;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "schools=" + studentsNumbers +
                '}';
    }
}
