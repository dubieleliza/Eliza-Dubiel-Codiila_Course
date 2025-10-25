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
        // Given
        // użytkownik nie jest jeszcze zapisany

        // When
        service.subscribe(karol1, "Warszawa");

        // Then
        assertTrue(service.isSubscribed(karol1, "Warszawa"));
    }

    @Test
    void unsubscribeFromLocation() {
        // Given
        service.subscribe(karol1, "Gdańsk");

        // When
        service.unsubscribe(karol1, "Gdańsk");

        // Then
        assertFalse(service.isSubscribed(karol1, "Gdańsk"));
    }

    @Test
    void unsubscribeFromAllLocations() {
        // Given
        service.subscribe(karol1, "Kraków");
        service.subscribe(karol1, "Wrocław");

        // When
        service.unsubscribeFromAll(karol1);

        // Then
        assertFalse(service.isSubscribed(karol1, "Kraków"));
        assertFalse(service.isSubscribed(karol1, "Wrocław"));
    }

    @Test
    void sendToLocationNotifiesOnlyThatLocation() {
        // Given
        service.subscribe(karol1, "Sopot");
        service.subscribe(janek, "Hel");
        service.subscribe(karol2, "Sopot");

        // When
        service.sendToLocation("Sopot", "Hail warning");

        // Then
        verify(nofifier).notify(karol1, "Hail warning");
        verify(nofifier).notify(karol2, "Hail warning");
        verify(nofifier, never()).notify(janek, "Hail warning");
    }

    @Test
    void sendToAllNotifiesEachUserOnce() {
        // Given
        service.subscribe(karol1, "Warszawa");
        service.subscribe(karol1, "Kraków");
        service.subscribe(janek, "Warszawa");

        // When
        service.sendToAll("System update");

        // Then
        verify(nofifier, times(1)).notify(karol1, "System update");
        verify(nofifier, times(1)).notify(janek, "System update");
    }

    @Test
    void removeLocationDeletesItCompletely() {
        // Given
        service.subscribe(karol1, "Łódź");
        service.subscribe(janek, "Gdańsk");

        // When
        service.removeLocation("Łódź");

        // Then
        assertFalse(service.isSubscribed(karol1, "Łódź"));
    }
}
