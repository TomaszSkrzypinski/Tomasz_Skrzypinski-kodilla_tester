package com.kodilla.spring.basic.dependency_injection.homework;

public class InpostDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy to Inpost");
            return false;
        }
        System.out.println("Delivering via Inpost in progress...");
        return true;
    }
}
