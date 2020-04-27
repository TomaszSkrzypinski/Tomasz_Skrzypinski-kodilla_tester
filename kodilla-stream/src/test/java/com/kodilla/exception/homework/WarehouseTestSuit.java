package com.kodilla.exception.homework;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WarehouseTestSuit {

    Order order;
    Warehouse warehouse = new Warehouse();

    @Test
    public void checkCorrectThrowExceptionForCorrectOrderNumber() throws OrderDoesntExistException {
        Order order1 = new Order("111");
        warehouse.addOrder(order1);
        order = warehouse.getOrder("111");

        assertEquals(order1, order);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void checkCorrectThrowExceptionForUncorrectOrderNumber() throws OrderDoesntExistException {
        order = warehouse.getOrder("11");
    }
}
