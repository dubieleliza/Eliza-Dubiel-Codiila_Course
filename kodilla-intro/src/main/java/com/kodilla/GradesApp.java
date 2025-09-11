package com.kodilla;


public class GradesApp {
    public static void main(String[] args) {
        Grades studentGrades = new Grades();
        studentGrades.add(5);
        studentGrades.add(4);
        System.out.println("Last grade: " + studentGrades.lastGrade());
        System.out.println("Average: " + studentGrades.gradePointAverage());
    }
}

