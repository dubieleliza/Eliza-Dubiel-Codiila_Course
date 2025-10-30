package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryServiceInt();
        NotificationService notificationService = new NotificationServiceInt();


        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        // testy z powinno dostarczyc i ze paczka za cięzka ~
        shippingCenter.sendPackage("Ulica Szkolna 11, Lublin", 18.2);
        shippingCenter.sendPackage("Ulica Biała, Janów Lubelski 13", 45.3);
    }
}