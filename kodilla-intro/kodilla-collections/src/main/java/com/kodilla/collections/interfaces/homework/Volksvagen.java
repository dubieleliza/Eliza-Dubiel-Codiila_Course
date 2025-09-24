package com.kodilla.collections.interfaces.homework;

public class Volksvagen implements Car {
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 85;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 22;
    }
}