package com.kodilla.spring.basic.dependency_injection.homework;

public class DeliveryServiceInt extends DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Paczka za cieżka");
            return false;
        }
        System.out.println("Dostawa w trakcie...");
        return true;
    }
}