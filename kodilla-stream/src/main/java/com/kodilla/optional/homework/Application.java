package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("teacher1");
        Teacher teacher2 = new Teacher("teacher2");

        List <Student> students = new ArrayList <>();
        students.add(new Student("student1", teacher1));
        students.add(new Student("student2", null));
        students.add(new Student("student3", teacher2));
        students.add(new Student("student4", null));
        students.add(new Student("student5", teacher1));

        for (Student student : students) { //Do tego miejsca chyba jest ok.
            Optional <Student> optionalStudent = Optional.ofNullable(student);

            optionalStudent.ifPresent(u -> System.out.println(student));
        }
    }
}
