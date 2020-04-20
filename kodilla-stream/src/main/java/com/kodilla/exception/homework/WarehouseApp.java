package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import com.kodilla.exception.AirportRepository;

public class WarehouseApp extends Warehouse {
    public static void main(String[] args) {

        Order order1 = new Order("111");
        Order order2 = new Order("157");
        Order order3 = new Order("201");
        Order order4 = new Order("101");
        Order order5 = new Order("067");
        Order order6 = new Order("252");

        WarehouseApp warehouseApp = new WarehouseApp();

        warehouseApp.addOrder(order1);
        warehouseApp.addOrder(order2);
        warehouseApp.addOrder(order3);
        warehouseApp.addOrder(order4);
        warehouseApp.addOrder(order5);
        warehouseApp.addOrder(order6);

        System.out.println(warehouseApp.orders.size());

        try {
            warehouseApp.getOrder("1");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order don't exist.");
        }

    }
}
