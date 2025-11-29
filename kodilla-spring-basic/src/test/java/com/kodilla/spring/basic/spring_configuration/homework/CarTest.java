package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;public class CarTest {

    @Test
    public void shouldReturnSUVType() {
        Car car = new SUV();
        assertEquals("SUV", car.getCarType());
    }

    @Test
    public void shouldReturnCabrioType() {
        Car car = new Cabrio();
        assertEquals("Cabrio", car.getCarType());
    }

    @Test
    public void shouldReturnSedanType() {
        Car car = new Sedan();
        assertEquals("Sedan", car.getCarType());
    }

    @Test
    public void shouldTurnOnHeadlightsAtNight_SUV() {
        Car car = new SUV();
        int testHour = 22; // 22:00 - noc
        boolean lightsOn = (testHour >= 20 || testHour < 6);
        assertTrue(lightsOn);
    }

    @Test
    public void shouldTurnOffHeadlightsDuringDay_SUV() {
        Car car = new SUV();
        int testHour = 10; // 10:00 - dzień
        boolean lightsOn = (testHour >= 20 || testHour < 6);
        assertFalse(lightsOn);
    }

    @Test
    public void shouldTurnOnHeadlightsAtNight_Cabrio() {
        Car car = new Cabrio();
        int testHour = 1; // 1:00 - noc
        boolean lightsOn = (testHour >= 20 || testHour < 6);
        assertTrue(lightsOn);
    }

    @Test
    public void shouldTurnOffHeadlightsDuringDay_Cabrio() {
        Car car = new Cabrio();
        int testHour = 14; // 14:00 - dzień
        boolean lightsOn = (testHour >= 20 || testHour < 6);
        assertFalse(lightsOn);
    }

    @Test
    public void shouldTurnOnHeadlightsAtNight_Sedan() {
        Car car = new Sedan();
        int testHour = 23; // 23:00 - noc
        boolean lightsOn = (testHour >= 20 || testHour < 6);
        assertTrue(lightsOn);
    }

    @Test
    public void shouldTurnOffHeadlightsDuringDay_Sedan() {
        Car car = new Sedan();
        int testHour = 8; // 8:00 - dzień
        boolean lightsOn = (testHour >= 20 || testHour < 6);
        assertFalse(lightsOn);
    }
}
