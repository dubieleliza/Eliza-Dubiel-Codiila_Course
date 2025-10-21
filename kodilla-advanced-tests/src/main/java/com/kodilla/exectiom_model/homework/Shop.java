package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private final Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        if (order != null) {
            orders.add(order);
        }
    }

    public List<Order> getOrdersBetweenDates(LocalDate start, LocalDate end) {
        return orders.stream()
                .filter(o -> !o.getDate().isBefore(start) && !o.getDate().isAfter(end))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByValueRange(double min, double max) {
        return orders.stream()
                .filter(o -> o.getValue() >= min && o.getValue() <= max)
                .collect(Collectors.toList());
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public double getTotalValue() {
        return orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }

    public void clear() {
        orders.clear();
    }
}
