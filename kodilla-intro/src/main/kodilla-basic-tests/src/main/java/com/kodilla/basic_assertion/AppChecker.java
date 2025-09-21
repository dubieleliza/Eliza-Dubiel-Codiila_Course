package com.kodilla.basic_assertion;

public class AppChecker {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 9.0;
        double b = 8.3;
        double subtractResult = calculator.subtract(a, b);
        boolean correct = ResultChecker.assertEquals(0.7, subtractResult, 0.001);
        if (correct) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
