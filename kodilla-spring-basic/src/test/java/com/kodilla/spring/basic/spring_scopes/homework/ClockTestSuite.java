package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTime() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        LocalTime firstBean = context.getBean(Clock.class).getTime();
        Thread.sleep(500);
        LocalTime secondBean = context.getBean(Clock.class).getTime();
        Thread.sleep(500);
        LocalTime thirdBean = context.getBean(Clock.class).getTime();
        Assertions.assertNotEquals(firstBean, secondBean);
        Assertions.assertNotEquals(secondBean, thirdBean);
        Assertions.assertNotEquals(firstBean, thirdBean);
    }

}