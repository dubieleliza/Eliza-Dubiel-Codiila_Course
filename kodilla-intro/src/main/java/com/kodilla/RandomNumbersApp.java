package com.kodilla;

public class RandomNumbersApp {
    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        rn.generateNumbers();

        System.out.println("Suma: " + rn.getSum());
        System.out.println("Największa: " + rn.getMax());
        System.out.println("Najmniejsza: " + rn.getMin());
    }
}
// Modyfikacja pliku dla commita