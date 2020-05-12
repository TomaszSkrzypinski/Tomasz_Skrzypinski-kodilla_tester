package com.kodilla.execution_model.Homework;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersFromTwoYears(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            List <Order> twoYearsOrders = orders.stream()
                    .filter(u -> u.getDate().isBefore(date2))
                    .filter(u -> u.getDate().isAfter(date1))
                    .collect(Collectors.toList());
            return twoYearsOrders;
        }else {
            List <Order> twoYearsOrders = orders.stream()
                    .filter(u -> u.getDate().isAfter(date2))
                    .filter(u -> u.getDate().isBefore(date1))
                    .collect(Collectors.toList());
            return twoYearsOrders;
        }
    }

    public List<Order> getOrdersBetweenMinAndMaxValues(double min, double max) {
        List<Order> ordersBetweenMinAndMax = orders.stream()
                .filter(u -> u.getValue() >= min)
                .filter(u -> u.getValue() <= max)
                .collect(Collectors.toList());
        return ordersBetweenMinAndMax;
    }

    public int getOrdersNumber() {
        int number = orders.size();
        return number;
    }

    public double getOrdersValue() {
        double value = 0;
        for (Order o : orders) {
            value += o.getValue();
        }
        return value;
    }
}
