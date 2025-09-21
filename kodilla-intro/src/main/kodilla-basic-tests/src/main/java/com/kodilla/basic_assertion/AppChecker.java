package com.kodilla.basic_assertion;

public class AppChecker {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 9;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        boolean correct = ResultChecker.assertEquals(2, subtractResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }

}
