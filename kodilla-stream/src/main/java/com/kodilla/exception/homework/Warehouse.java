package com.kodilla.exception.homework;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    List<Order> orders = new LinkedList<>();

    public List <Order> getOrders() {
        return orders;
    }

    public List<Order> addOrder(Order order) {
        orders.add(order);
        return null;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> orders2 = orders.stream()
                .filter(u -> u.getNumber().equals(number))
                .collect(Collectors.toList());

        if (orders2.size() > 0)
            return orders2.get(0);
        else
            throw new OrderDoesntExistException();
    }
}