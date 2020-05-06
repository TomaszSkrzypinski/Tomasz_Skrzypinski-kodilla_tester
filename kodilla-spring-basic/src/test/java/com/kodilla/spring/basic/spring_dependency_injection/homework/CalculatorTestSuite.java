package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    Display display = new Display();
    Calculator calculator = new Calculator(display);

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Display bean = context.getBean(Display.class);

    @Test
    public void checkAddMethod() {
        Double expected = bean.display(15);
        Double actual = calculator.add(12,3) ;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSubtractMethod() {
        Double expected = bean.display(9);
        Double actual = calculator.subtract(12,3) ;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMultiplyMethod() {
        Double expected = bean.display(36);
        Double actual = calculator.multiply(12, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkDivideMethod() throws DivideByZeroException {
        Double expected = bean.display(4);
        Double actual = calculator.divide(12, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test(expected = DivideByZeroException.class)
    public void checkDivideMethodDivideByZero() throws DivideByZeroException {
        calculator.divide(12, 0);
    }
}
