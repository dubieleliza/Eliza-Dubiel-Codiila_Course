package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");

        Car car = context.getBean(Car.class);

        System.out.println("Car type: " + car.getCarType());
        System.out.println("Headlights on: " + car.hasHeadlightsTurnedOn());
    }
}
