package com.kodilla;

public class Loops {
    public static int sumNumbers(int[] numbers) {
        int sum = 0;
        for (int n : numbers) sum += n;
        return sum;
    }
}
