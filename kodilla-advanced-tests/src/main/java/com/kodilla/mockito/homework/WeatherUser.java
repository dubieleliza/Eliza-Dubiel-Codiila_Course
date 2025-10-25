package com.kodilla.mockito.homework;

import java.util.Objects;

public class WeatherUser {
    private final String id;
    private final String name;

    public WeatherUser(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeatherUser)) return false;
        WeatherUser user = (WeatherUser) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
// komentarz do edycji