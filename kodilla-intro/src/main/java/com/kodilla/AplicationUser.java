package com.kodilla;

public class AplicationUser {
    private String name;
    private double age;
    private double height;

    public AplicationUser(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkEligibility() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println(name + " is older than 30 and taller than 160cm");
            } else {
                System.out.println(name + " is 30 (or younger) or 160cm (or shorter)");
            }
        } else {
            System.out.println("User has no name");
        }
    }
}
