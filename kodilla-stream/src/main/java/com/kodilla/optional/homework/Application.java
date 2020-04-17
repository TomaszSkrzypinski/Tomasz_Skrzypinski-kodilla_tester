package com.kodilla.optional.homework;

import com.kodilla.stream.User;
import org.w3c.dom.ls.LSOutput;

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

        for (Student student : students) {

            String optionalTeacher = Optional.ofNullable(student.getTeacher()).map(u -> u.getTeacherName()).orElse("<undefined>");

            System.out.println("Uczeń " + student.getName() + ", nauczyciel: " + optionalTeacher);
        }
    }
}
