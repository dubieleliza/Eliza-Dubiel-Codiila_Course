package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationServiceInt implements NotificationService {

    @Override
    public void success(String address) {
        System.out.println("Paczka doręczona: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Paczka za cięzka: " + address);
    }
}