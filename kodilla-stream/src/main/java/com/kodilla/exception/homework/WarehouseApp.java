package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("001"));
        warehouse.addOrder(new Order("002"));
        warehouse.addOrder(new Order("003"));

        try {
            Order order = warehouse.getOrder("004");
            System.out.println("Znaleziono zamówienie: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Zamówienie o podanym numerze nie istnieje.");
        }
    }
}

