package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultCheckerTest {

    ResultChecker result = new ResultChecker();

    @Test
    public void checkAssertEqualsMethod() {
       Assertions.assertTrue(result.assertEquals(20,20), String.valueOf(true));
    }

}