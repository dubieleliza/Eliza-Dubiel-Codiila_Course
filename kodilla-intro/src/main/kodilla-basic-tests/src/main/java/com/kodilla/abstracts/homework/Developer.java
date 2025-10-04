package com.kodilla.abstracts.homework;

public class Developer extends Job{
    public Developer(double salary) {
        super(salary, "Creating backend, annoy Julian");
    }
    public String getJobTitle() {
        return "Developer";
    }
}

