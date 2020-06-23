package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    Shape shape1 = new Shape(15) {
        @Override
        public void surfaceArea() {

        }

        @Override
        public void circuit() {

        }
    };

    Shape shape2 = new Shape(20, 20, 20, 20) {
        @Override
        public void surfaceArea() {

        }

        @Override
        public void circuit() {

        }
    };

    @Test
    void getRadius() {
        double radius = shape1.getRadius();
        Assertions.assertEquals(radius, 15);
    }

    @Test
    void getSideA() {
        double sideA = shape2.getSideA();
        Assertions.assertEquals(sideA, 20);
    }

    @Test
    void getSideB() {
        double sideB = shape2.getSideB();
        Assertions.assertEquals(sideB, 20);
    }

    @Test
    void getBase() {
        double base = shape2.getBase();
        Assertions.assertEquals(base, 20);
    }

    @Test
    void getHeight() {
        double height = shape2.getHeight();
        Assertions.assertEquals(height, 20);
    }
}