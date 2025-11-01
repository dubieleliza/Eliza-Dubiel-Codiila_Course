package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux(int releaseYear, int endOfSupportYear) {
        super(releaseYear,endOfSupportYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Linux is starting...");
    }

    @Override
    public void turnOff() {
        System.out.println("Linux is shutting down...");
    }
}