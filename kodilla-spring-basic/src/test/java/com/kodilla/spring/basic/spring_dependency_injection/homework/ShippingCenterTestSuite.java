package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

    @Test
    public void shouldDeliveryServiceReturnTrue() {
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean value = bean.deliverPackage("Test Address", 25);
        Assertions.assertTrue(value);
    }

    @Test
    public void shouldDeliveryServiceReturnFalse() {
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean value = bean.deliverPackage("Test Address", 35);
        Assertions.assertFalse(value);
    }

    @Test
    public void shouldNotificationServiceSuccessMethodReturnCorrectMessage() {
        NotificationService bean = context.getBean(NotificationService.class);
        String actual = bean.success("Test Address");
        String expected = "Package delivered to: Test Address";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotificationServiceFailMethodReturnCorrectMessage() {
        NotificationService bean = context.getBean(NotificationService.class);
        String actual = bean.fail("Test Address");
        String expected = "Package not delivered to: Test Address";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldShippingCenterSendPackageMethodReturnCorrectSuccessMessage() {
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String actual = bean.sendPackage("Test Address", 25);
        String expected = "Package delivered to: Test Address";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldShippingCenterSendPackageMethodReturnCorrectFailMessage() {
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String actual = bean.sendPackage("Test Address", 35);
        String expected = "Package not delivered to: Test Address";
        Assertions.assertEquals(actual, expected);
    }
}