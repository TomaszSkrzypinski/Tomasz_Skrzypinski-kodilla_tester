package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    ShippingCenter shippingCenter = new ShippingCenter();

    @Test
    public void shouldDeliveryServiceReturnTrue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean value = bean.deliverPackage("Test Address", 25);
        Assertions.assertTrue(value);
    }

    @Test
    public void shouldDeliveryServiceReturnFalse() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean value = bean.deliverPackage("Test Address", 35);
        Assertions.assertFalse(value);
    }

    @Test
    public void shouldNotificationServiceSuccessMethodReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String actual = bean.success("Test Address");
        String expected = "Package delivered to: Test Address";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotificationServiceFailMethodReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String actual = bean.fail("Test Address");
        String expected = "Package not delivered to: Test Address";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldShippingCenterSendPackageMethodReturnCorrectSuccessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String actual = bean.sendPackage("Test Address", 25);
        String expected = "Package delivered to: Test Address";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldShippingCenterSendPackageMethodReturnCorrectFailMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String actual = bean.sendPackage("Test Address", 35);
        String expected = "Package not delivered to: Test Address";
        Assertions.assertEquals(actual, expected);
    }
}
