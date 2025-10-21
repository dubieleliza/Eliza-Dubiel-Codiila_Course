package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class AlertServiceTest {
    private Nofifier nofifier;
    private AlertService service;
    private WeatherUser karol1;
    private WeatherUser janek;
    private WeatherUser karol2;

    @BeforeEach
    void setUp() {
        nofifier = mock(Nofifier.class);
        service = new AlertService(nofifier);

        karol1 = new WeatherUser("karol1@example.com", "Karol");
        janek  = new WeatherUser("janek@example.com", "Janek");
        karol2 = new WeatherUser("karol2@example.com", "Karol");
    }

    @Test
    void subscribeAndCheckSubscription() {
        service.subscribe(karol1, "Warszawa");
        assertTrue(service.isSubscribed(karol1, "Warszawa"));
    }

    @Test
    void unsubscribeFromLocation() {
        service.subscribe(karol1, "Gdańsk");
        service.unsubscribe(karol1, "Gdańsk");
        assertFalse(service.isSubscribed(karol1, "Gdańsk"));
    }

    @Test
    void unsubscribeFromAllLocations() {
        service.subscribe(karol1, "Kraków");
        service.subscribe(karol1, "Wrocław");
        service.unsubscribeFromAll(karol1);
        assertFalse(service.isSubscribed(karol1, "Kraków"));
        assertFalse(service.isSubscribed(karol1, "Wrocław"));
    }

    @Test
    void sendToLocationNotifiesOnlyThatLocation() {
        service.subscribe(karol1, "Sopot");
        service.subscribe(janek, "Hel");
        service.subscribe(karol2, "Sopot");

        service.sendToLocation("Sopot", "Hail warning");

        verify(nofifier).notify(karol1, "Hail warning");
        verify(nofifier).notify(karol2, "Hail warning");
        verify(nofifier, never()).notify(janek, "Hail warning");
    }

    @Test
    void sendToAllNotifiesEachUserOnce() {
        service.subscribe(karol1, "Warszawa");
        service.subscribe(karol1, "Kraków");
        service.subscribe(janek, "Warszawa");

        service.sendToAll("System update");

        verify(nofifier, times(1)).notify(karol1, "System update");
        verify(nofifier, times(1)).notify(janek, "System update");
    }

    @Test
    void removeLocationDeletesItCompletely() {
        service.subscribe(karol1, "Łódź");
        service.subscribe(janek, "Gdańsk");

        service.removeLocation("Łódź");
        assertFalse(service.isSubscribed(karol1, "Łódź"));
    }
}
