package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Person alice = new Person("Eliza", 30, new SoftwareTester(9000));
        Person bob = new Person("Agata", 25, new Developer(15000));
        Person charlie = new Person("Monika", 40, new UiDesigner(20000));

        alice.showResponsibilities();
        bob.showResponsibilities();
        charlie.showResponsibilities();
    }
}


