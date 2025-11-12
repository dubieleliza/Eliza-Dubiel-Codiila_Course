package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        int hour = LocalTime.now().getHour();
        return hour >= 20 || hour < 6;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
