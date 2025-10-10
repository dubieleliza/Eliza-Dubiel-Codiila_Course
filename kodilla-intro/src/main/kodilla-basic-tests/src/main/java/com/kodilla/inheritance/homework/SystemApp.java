package com.kodilla.inheritance.homework;

public class SystemApp {
    public static void main(String [] args) {
        Windows win = new Windows(2019,2020);
        Linux linux = new Linux(2020,2022);

        System.out.println("Windows release year: " + win.getReleaseYear() + ", end of support: " + win.getEndOfSupportYear());
        win.turnOn();
        win.turnOff();

        System.out.println("Linux release year: " + linux.getReleaseYear() + ", end of support: " + linux.getEndOfSupportYear());
        linux.turnOn();
        linux.turnOff();
    }
}
