package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volksvagen;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car ford = new Ford();
        Car opel = new Opel();
        Car volkswagen = new Volksvagen();

        cars.add(ford);
        cars.add(opel);
        cars.add(volkswagen);

        for (Car car : cars) {
            System.out.println(car);
        }

        cars.remove(1);
        cars.remove(ford);

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("Aktualny rozmiar listy: " + cars.size());
    }
}
