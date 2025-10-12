package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrderExists() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("101"));
        warehouse.addOrder(new Order("102"));

        Order order = warehouse.getOrder("101");

        assertEquals("101", order.getNumber());
    }

    @Test
    public void testGetOrder_withException() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("201"));
        warehouse.addOrder(new Order("202"));

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("999"));
    }
}
