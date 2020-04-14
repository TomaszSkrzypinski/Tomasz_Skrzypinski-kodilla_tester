package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List <Task> getTasks(){
        List<Task> tasks = new ArrayList <>();
        tasks.add(new Task("Task1", LocalDate.of(2018,10,25), LocalDate.of(2021,10,25)));
        tasks.add(new Task("Task2", LocalDate.of(2018,10,25), LocalDate.of(2022,10,25)));
        tasks.add(new Task("Task3", LocalDate.of(2018,10,25), LocalDate.of(2020,10,25)));
        tasks.add(new Task("Task4", LocalDate.of(2018,10,25), LocalDate.of(2020,4,12)));
        tasks.add(new Task("Task5", LocalDate.of(2018,10,25), LocalDate.of(2020,4,25)));
        tasks.add(new Task("Task6", LocalDate.of(2018,10,25), LocalDate.of(2020,3,25)));
        return tasks;
    }
}
