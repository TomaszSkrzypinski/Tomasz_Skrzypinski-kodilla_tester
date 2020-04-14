package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List <String> tasknames = TaskRepository.getTasks()
                .stream()
                .filter(TaskManager::compareDate)
                .map(TaskManager::getTaskName)
                .collect(Collectors.toList());
        System.out.println(tasknames);
    }

    public static String getTaskName(Task task) {
        return task.getName();
    }

    public static boolean compareDate(Task task) {
        LocalDate deadline = task.getDeadline();
        LocalDate currentDate = LocalDate.now();
        deadline.isAfter(currentDate);
        return true;
    }
}


