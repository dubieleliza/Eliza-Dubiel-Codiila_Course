package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class School {
    private String name;
    private List<Integer> studentsInClasses = new ArrayList<>();

    public School(String name, Integer... students) {
        this.name = name;
        this.studentsInClasses = Arrays.asList(students);
    }

    public String getName() {
        return name;
    }

    public int getTotalStudents() {
        int sum = 0;
        for (int students : studentsInClasses) {
            sum += students;
        }
        return sum;
    }

    @Override
    public String toString() {
        return name + " (students: " + getTotalStudents() + ")";
    }
}
