package com.kodilla.execution_model.Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

class ShopTestSuite {

    Shop shop = new Shop();

    LocalDate date1 = LocalDate.of(2018,6,22);
    LocalDate date2 = LocalDate.of(2019,6,18);
    LocalDate date3 = LocalDate.of(2017,3,2);
    LocalDate date4 = LocalDate.of(2018,9,14);

    Order order1 = new Order(20.50, "user1", date1);
    Order order2 = new Order(11.75, "user2", date2);
    Order order3 = new Order(32.88, "user3", date2);
    Order order4 = new Order(26.50, "user2", date3);
    Order order5 = new Order(58.99, "user4", date4);

    @BeforeEach
    public void initializeOrders() {
        shop.getOrders().add(order1);
        shop.getOrders().add(order2);
        shop.getOrders().add(order3);
        shop.getOrders().add(order4);
        shop.getOrders().add(order5);
    }

    @Test
    public void ifAddOrderWorkingCorrectForFiveOrder() {
        int result = shop.getOrders().size();
        assertEquals(5, result);
    }

    @Test
    public void checkGetOrdersFromTwoYearsMethod() {
        LocalDate date7 = LocalDate.of(2018,8,29);
        LocalDate date8 = LocalDate.of(2019,7,15);
        List<Order> twoYearsOrders = shop.getOrdersFromTwoYears(date7, date8);
        int result = twoYearsOrders.size();
        assertEquals(3, result);
    }

    @Test
    public void checkGetOrdersBetweenMinAndMaxValues(){
        double min = 15;
        double max = 35;
        List<Order> minMaxOrders = shop.getOrdersBetweenMinAndMaxValues(min, max);
        int result = minMaxOrders.size();
        assertEquals(3, result);
    }

    @Test
    public void checkGetOrdersNumberMethod() {
        int result = shop.getOrdersNumber();
        assertEquals(5, result);
    }

    @Test
    public void checkGetOrdersValueMethod() {
        double result = shop.getOrdersValue();
        assertEquals(150.62, result);
    }
}