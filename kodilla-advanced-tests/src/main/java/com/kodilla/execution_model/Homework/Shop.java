//package com.kodilla.execution_model.Homework;
//
//import java.time.LocalDate;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import static jdk.jfr.internal.Utils.isAfter;
//
//public class Shop {
//
//    Set<Order> orders = new HashSet<>();
//
//    public void addOrder(Order order) {
//        orders.add(order);
//    }
//
//    public List<Order> getOrdersFromLastTwoYears() {
//        LocalDate date = LocalDate.now().minusYears(2);
//        List<Order> twoYearsOrders = orders.stream()
//                .map(u -> u.getDate())
//                .filter(u -> isAfter(date))
//                //co zrobić żeby nie podkreślało metody isAfter?
//                .collect(Collectors.toList());
//        return twoYearsOrders;
//    }
//
//    public List<Order> getOrdersBetweenMinAndMaxValues(double min, double max) {
//        List<Order> ordersBetweenMinAndMax = orders.stream()
//                .map(u -> u.getValue())
//                .filter(u -> u >= min)
//
//                .collect(Collectors.toList());
//        //Stream zwraca listę obiektów typu Double, a chciałbym, żeby zwracał Order.
//        return ordersBetweenMinAndMax;
//    }
//
//    public int getOrdersNumber() {
//        int number = orders.size();
//        return number;
//    }
//
//    public double getOrdersValue() {
//        double value = 0;
//        for (Order o : orders) {
//            value += o.getValue();
//        }
//        return value;
//    }
//}
