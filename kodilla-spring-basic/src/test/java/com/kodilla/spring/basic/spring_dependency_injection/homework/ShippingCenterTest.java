package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShippingCenterTest {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    public void shouldDeliverPackageSuccessfully() {
        String result = shippingCenter.sendPackage("Warszawy", 10.0);
        assertEquals("Paczka została doręczona do: Warszawy", result);
    }

    @Test
    public void shouldFailToDeliverTooHeavyPackage() {
        String result = shippingCenter.sendPackage("Gdanska", 40.0);
        assertEquals("Paczka nie została doręczona do: Gdanska", result);
    }
}