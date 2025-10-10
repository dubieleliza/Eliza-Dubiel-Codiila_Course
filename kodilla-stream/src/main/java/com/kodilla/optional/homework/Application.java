package com.kodilla.optional.homework;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Joanna Omiotek");
        Teacher teacher2 = new Teacher("Eliza Dubiel");
        Teacher teacher3 = new Teacher("Jolanta Szajnowska");
        Teacher teacher4 = new Teacher("Barbara Kozioł");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Kuba Wojciechowski", teacher3));
        students.add(new Student("Eliza Czerwonka", teacher2));
        students.add(new Student("Klaudia Kulasza", teacher4));
        students.add(new Student("Karolina Jasińska", null));
        students.add(new Student("Aldona Łoś", null));
        students.add(new Student("Waleria Białogłowska", teacher1));

        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println(student.getName() + " - teacher: " + teacherName);
        }
    }
}
