package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map <Principal, School> school = new HashMap <>();
        Principal jan = new Principal("Jan", "Kowalski");
        Principal michal = new Principal("Michał", "Nowak");
        Principal karolina = new Principal("Karolina", "Wiśniewska");

        String sp3 = "Szkoła Podstawowa nr 3";
        String sp4 = "Szkoła Podstawowa nr 4";
        String lo1 = "Liceum nr 1";
        School school1 = new School(sp3, 27, 22, 26);
        School school2 = new School(sp4, 29, 28, 30);
        School school3 = new School(lo1, 21, 23, 27);


        school.put(jan, school2);
        school.put(karolina, school1);
        school.put(michal, school3);

        for (Map.Entry <Principal, School> principalSchoolEntry : school.entrySet())
            System.out.println(principalSchoolEntry.getKey().getFirstname() + " " + principalSchoolEntry.getKey().getLastname() + " principal of " + principalSchoolEntry.getValue().getName() + " with " + principalSchoolEntry.getValue().getStudentsSum() + " students.");
    }
}
