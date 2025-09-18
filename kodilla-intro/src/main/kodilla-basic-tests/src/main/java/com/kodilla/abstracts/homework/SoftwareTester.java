package com.kodilla.abstracts.homework;

public class SoftwareTester extends Job {

    public SoftwareTester(double salary) {
        super(salary, "Finding bugs, annoy Agata");
    }
    public String getJobTitle() {
        return "Software Tester";
    }
}
