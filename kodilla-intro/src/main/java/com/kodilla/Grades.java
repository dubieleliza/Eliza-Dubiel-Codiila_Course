package com.kodilla;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (size == 10) return;
        grades[size] = value;
        size++;
    }

    public int lastGrade() {
        if (size == 0) {
            System.out.println("No grades in the table");
            return -1;
        }
        return grades[size - 1];
    }

    public double gradePointAverage() {
        if (size == 0) {
            System.out.println("No grades in the table!");
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += grades[i];  // tak jak users[i].getAge(), tylko tu mamy zwykłą tablicę int
        }

        return (double) sum / size;
    }
}