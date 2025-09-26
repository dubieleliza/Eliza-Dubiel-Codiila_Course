package com.kodilla;

public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);          // [1]
        System.out.println("Area of the Circle with radius 10 equals: " + area);
    }
}