package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int releaseYear, int endOfSupportYear) {
        super(releaseYear,endOfSupportYear);
    }
    public void turnOn() {
        System.out.println("Windows is starting...");
    }
    public void turnOff() {
        System.out.println("Windows is shutting down...");
    }
}
