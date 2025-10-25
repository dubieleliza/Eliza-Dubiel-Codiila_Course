package com.kodilla.mockito.homework;

import java.util.*;

public class AlertService {
    private final Map<String, Set<WeatherUser>> subscribersByLocation = new HashMap<>();
    private final Nofifier nofifier;

    public AlertService(Nofifier nofifier) {
        this.nofifier = nofifier;
    }

    public void subscribe(WeatherUser user, String location) {
        subscribersByLocation
                .computeIfAbsent(location, k -> new HashSet<>())
                .add(user);
    }

    public void unsubscribe(WeatherUser user, String location) {
        Set<WeatherUser> set = subscribersByLocation.get(location);
        if (set != null) {
            set.remove(user);
            if (set.isEmpty()) {
                subscribersByLocation.remove(location);
            }
        }
    }

    public void unsubscribeFromAll(WeatherUser user) {
        Iterator<Map.Entry<String, Set<WeatherUser>>> it = subscribersByLocation.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Set<WeatherUser>> entry = it.next();
            entry.getValue().remove(user);
            if (entry.getValue().isEmpty()) it.remove();
        }
    }

    public boolean isSubscribed(WeatherUser user, String location) {
        Set<WeatherUser> set = subscribersByLocation.get(location);
        return set != null && set.contains(user);
    }

    public void sendToLocation(String location, String message) {
        Set<WeatherUser> set = subscribersByLocation.get(location);
        if (set == null) return;
        for (WeatherUser user : new HashSet<>(set)) {
            nofifier.notify(user, message);
        }
    }

    public void sendToAll(String message) {
        Set<WeatherUser> all = new HashSet<>();
        for (Set<WeatherUser> set : subscribersByLocation.values()) {
            all.addAll(set);
        }
        for (WeatherUser user : all) {
            nofifier.notify(user, message);
        }
    }

    public void removeLocation(String location) {
        subscribersByLocation.remove(location);
    }

    public int locationCount() {
        return subscribersByLocation.size();
    }
}

