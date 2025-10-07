package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("Paris", "Warsaw"));
        flights.add(new Flight("Berlin", "Paris"));
        flights.add(new Flight("Rome", "Warsaw"));
        return flights;
    }
}
