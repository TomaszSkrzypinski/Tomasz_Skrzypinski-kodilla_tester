package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatingSystemTest {
    Windows windows = new Windows(2000);

    @Test
    public void checkGetYearMethod() {
        int year = windows.getYear();
        Assertions.assertEquals(year, 2000);
    }

}