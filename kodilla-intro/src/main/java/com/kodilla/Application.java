package com.kodilla;

public class Application {
    public static void main(String[] args) {
        AplicationUser user = new AplicationUser("Adam", 40.5, 178);
        user.checkEligibility();
    }
}