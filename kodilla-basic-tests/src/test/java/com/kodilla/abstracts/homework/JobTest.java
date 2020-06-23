package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    Job policeman = new Policeman(55,"responsibilities");

    @Test
    public void checkGetSalaryMethod() {
        int salary = policeman.getSalary();
        Assertions.assertEquals(salary, 55);
    }

    @Test
    public void checkGetResponsibilitiesMethod() {
        String responsibilities = policeman.getResponsibilities();
        Assertions.assertEquals(responsibilities, "responsibilities");
    }
}