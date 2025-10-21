package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {

    Shop shop = new Shop();
    Order order1 = new Order(100.0, LocalDate.of(2025, 10, 10), "anna");
    Order order2 = new Order(150.0, LocalDate.of(2025, 10, 15), "bartek");
    Order order3 = new Order(300.0, LocalDate.of(2025, 10, 20), "celina");

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting Shop tests...");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finished Shop tests.");
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @AfterEach
    public void clearShopAfterTest() {
        shop.clear();
        System.out.println("Shop cleared after test.");
    }

    @Test
    public void shouldAddOrdersToShop() {
        // When
        int numberOfOrders = shop.getNumberOfOrders();

        // Then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldReturnOrdersBetweenDates() {
        // When
        List<Order> result = shop.getOrdersBetweenDates(
                LocalDate.of(2025, 10, 11),
                LocalDate.of(2025, 10, 19)
        );

        // Then
        assertEquals(1, result.size());
        assertEquals("bartek", result.get(0).getLogin());
    }

    @Test
    public void shouldReturnOrdersByValueRange() {
        // When
        List<Order> result = shop.getOrdersByValueRange(120, 250);

        // Then
        assertEquals(1, result.size());
        assertEquals(150.0, result.get(0).getValue());
    }

    @Test
    public void shouldCountNumberOfOrders() {
        // When
        int count = shop.getNumberOfOrders();

        // Then
        assertEquals(3, count);
    }

    @Test
    public void shouldSumTotalOrderValue() {
        // When
        double sum = shop.getTotalValue();

        // Then
        assertEquals(550.0, sum, 0.01);
    }

    @Test
    public void shouldReturnEmptyListWhenNoOrdersInDateRange() {
        // When
        List<Order> result = shop.getOrdersBetweenDates(
                LocalDate.of(2025, 9, 1),
                LocalDate.of(2025, 9, 30)
        );

        // Then
        assertTrue(result.isEmpty());
    }

    @Test
    public void shouldClearAllOrders() {
        // When (chyba)
        shop.clear();

        // Then
        assertEquals(0, shop.getNumberOfOrders());
    }
}
