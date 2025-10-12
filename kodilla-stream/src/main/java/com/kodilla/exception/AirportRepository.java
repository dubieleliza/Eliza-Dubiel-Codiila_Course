package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {

    private Map<String, Boolean> airports = new HashMap<>();

    public AirportRepository() {
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("LasPalmas", false);
        airports.put("Warsaw", true);
    }

    public Map<String, Boolean> getListOfAirports() {
        return airports;
    }

    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if (airports.containsKey(airport)) {
            return airports.get(airport);
        }
        throw new AirportNotFoundException();
    }
}
