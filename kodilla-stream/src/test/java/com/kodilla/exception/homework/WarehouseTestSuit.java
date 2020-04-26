package com.kodilla.exception.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WarehouseTestSuit {

    Order order;
    Warehouse warehouse = new Warehouse();

    @Test
    public void checkCorrectThrowExceptionForCorrectOrderNumber() throws OrderDoesntExistException {
        order = warehouse.getOrder("111");
        Order order1 = new Order("111");
        assertEquals(order, order1);
        //Test nie przechodzi. Chce żeby metoda getOrder zwróciła order 111 i porównuję to do nowego orderu 111.
    }

    @Test(expected = OrderDoesntExistException.class)
    public void checkCorrectThrowExceptionForUncorrectOrderNumber() throws OrderDoesntExistException {
        order = warehouse.getOrder("14");
    }
}
