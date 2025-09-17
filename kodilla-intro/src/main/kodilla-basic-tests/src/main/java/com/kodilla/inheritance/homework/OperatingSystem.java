package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;
    private int endOfSupportYear;

    public OperatingSystem (int releaseYear, int endOfSupportYear) {
        this.releaseYear = releaseYear;
        this.endOfSupportYear = endOfSupportYear;
    }

    public void turnOn() {
        System.out.println("System is turning on ...");
    }
    public void turnOff() {
        System.out.println("System is shutting down ...");
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public int getEndOfSupportYear() {
        return endOfSupportYear;
    }
}
