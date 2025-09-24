package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        Opel opel = new Opel();
        Volksvagen volksvagen = new Volksvagen();

        doRace(ford);
        doRace(opel);
        doRace(volksvagen);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("Final speed of " + car.getClass().getSimpleName() + ": " + car.getSpeed());
    }
}
