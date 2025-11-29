package com.kodilla.abstracts.homework;

public class UiDesigner extends Job {
    public UiDesigner(double salary) {
        super(salary, "Creating frontend, annoy Julian");
    }
    public String getJobTitle() {
        return "Ui Designer";
    }
}

