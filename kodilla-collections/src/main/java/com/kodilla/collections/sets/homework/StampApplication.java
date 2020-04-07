package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.homework.Stamp;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set <Stamp> stamps = new HashSet <>();
        stamps.add(new Stamp("stamp1", "15x17", "yes"));
        stamps.add(new Stamp("stamp2", "14x11", "yes"));
        stamps.add(new Stamp("stamp3", "18x12", "no"));
        stamps.add(new Stamp("stamp4", "11x11", "no"));
        stamps.add(new Stamp("stamp2", "14x11", "yes"));
        stamps.add(new Stamp("stamp4", "11x11", "no"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
