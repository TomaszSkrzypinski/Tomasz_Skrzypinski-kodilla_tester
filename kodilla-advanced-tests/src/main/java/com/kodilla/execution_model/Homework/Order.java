package com.kodilla.execution_model.Homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private double value;
    private String userLogin;
    private LocalDate date;

    public Order(double value, String userLogin, LocalDate date) {
        this.value = value;
        this.userLogin = userLogin;
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 &&
                Objects.equals(userLogin, order.userLogin) &&
                Objects.equals(date, order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, userLogin, date);
    }
}
