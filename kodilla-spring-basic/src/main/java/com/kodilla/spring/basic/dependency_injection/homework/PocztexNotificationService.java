package com.kodilla.spring.basic.dependency_injection.homework;

public class PocztexNotificationService implements NotificationService {

    @Override
    public void success(String address) {
        System.out.println("Package delivered via Pocztex to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered via Pocztex to: " + address);
    }
}
