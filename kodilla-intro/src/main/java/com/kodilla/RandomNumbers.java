package com.kodilla;
import java.util.Random;

public class RandomNumbers {

    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;
    private int sum = 0;
    private Random random = new Random();

    public void generateNumbers() {
        while (sum <= 5000) {
            int num = random.nextInt(31); // losuje liczby 0-30
            sum += num;

            if (num > max) max = num;
            if (num < min) min = num;
        }
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getSum() {
        return sum;
    }
}
// Modyfikacja pliku do commita git status
