package com.kodilla.exception.homework;

import java.util.LinkedList;
import java.util.List;

public class Warehouse {

    List <Order> orders = new LinkedList <>();

    public List <Order> addOrder(Order order) {
        orders.add(order);
        return null;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        orders
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .forEach(u -> System.out.println("number " + u));
        throw new OrderDoesntExistException();
    }
}

