package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTest {

    @Test
    public void testGetOrderShouldThrowExceptionWhenOrderDoesNotExist() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("001"));
        warehouse.addOrder(new Order("002"));

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("999"));
    }

    @Test
    public void testGetOrderShouldReturnOrderWhenExists() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));

        Order result = warehouse.getOrder("123");

        assertEquals("123", result.getNumber());
    }
}
