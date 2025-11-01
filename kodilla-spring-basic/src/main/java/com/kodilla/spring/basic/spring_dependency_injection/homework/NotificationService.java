package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public String success(String address) {
        return "Paczka została doręczona do: " + address;
    }

    public String fail(String address) {
        return "Paczka nie została doręczona do: " + address;
    }
}