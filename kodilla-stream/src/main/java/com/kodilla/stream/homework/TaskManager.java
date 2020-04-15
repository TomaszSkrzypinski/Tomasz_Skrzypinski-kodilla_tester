package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List <LocalDate> dates = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isAfter(u.getCurrentDate()))
                .map(u -> u.getDeadline())
                .collect(Collectors.toList());
        System.out.println(dates);
    }
}