package com.kodilla.spring.basic.dependency_injection.homework;

public class InpostNotificationService implements NotificationService {

    @Override
    public void success(String address) {
        System.out.println("Package delivered via Inpost to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered via Inpost to: " + address);
    }
}