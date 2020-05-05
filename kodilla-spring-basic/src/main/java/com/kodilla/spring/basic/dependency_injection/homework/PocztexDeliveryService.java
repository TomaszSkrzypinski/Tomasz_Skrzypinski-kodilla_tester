package com.kodilla.spring.basic.dependency_injection.homework;

public class PocztexDeliveryService implements DeliveryService{

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy to Pocztex");
            return false;
        }
        System.out.println("Delivering via Pocztex in progress...");
        return true;
    }
}
