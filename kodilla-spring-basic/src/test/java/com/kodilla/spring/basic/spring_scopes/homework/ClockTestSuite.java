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
    public void shouldCreateDifferentTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        LocalTime firstBean = context.getBean(Clock.class).getTime();
        LocalTime secondBean = context.getBean(Clock.class).getTime();
        LocalTime thirdBean = context.getBean(Clock.class).getTime();
        Assertions.assertNotEquals(firstBean, thirdBean);
        //porównanie między beanami utworzonymi bezpośrednio po sobie potrafiło dać wynik true,
        // dlatego porównuję pierwszego i trzeciebi beana
    }

}