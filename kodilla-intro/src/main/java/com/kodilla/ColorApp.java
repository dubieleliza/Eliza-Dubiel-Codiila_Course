package com.kodilla;

public class ColorApp {
    public static void main(String[] args) {
        String color = ColorDialogs.getColorByFirstLetter();
        System.out.println("Wybrany kolor: " + color);
    }
}

