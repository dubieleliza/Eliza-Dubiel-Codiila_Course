package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volksvagen;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int carsCount = RANDOM.nextInt(15) + 1;
        Car[] cars = new Car[carsCount];

        for (int n = 0; n < cars.length; n++) {
            cars[n] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        int drawnCarKind = RANDOM.nextInt(3);
        int increaseTimes = RANDOM.nextInt(5) + 1;
        Car car;

        if (drawnCarKind == 0) {
            car = new Volksvagen();
        } else if (drawnCarKind == 1) {
            car = new Ford();
        } else {
            car = new Opel();
        }

        for (int i = 0; i < increaseTimes; i++) {
            car.increaseSpeed();
        }

        return car;
    }
}
