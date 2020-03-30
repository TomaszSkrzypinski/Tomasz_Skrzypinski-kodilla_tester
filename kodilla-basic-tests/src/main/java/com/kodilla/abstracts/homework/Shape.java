package com.kodilla.abstracts.homework;

public abstract class Shape {

private double radius;
private double sideA;
private double sideB;
private double base;
private double height;
private double sideC;
private double sideD;

    public Shape(double radius) {
        this.radius = radius;
        }

    public Shape(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        }

    public Shape(double base, double height, double sideC, double sideD) {
        this.base = base;
        this.height = height;
        this.sideC = sideC;
        this.sideD = sideD;
        }

    public abstract void surfaceArea();

    public abstract void circuit();

    public double getRadius() {
        return radius;
        }

    public double getSideA() {
        return sideA;
        }

    public double getSideB() {
        return sideB;
        }

    public double getBase() {
        return base;
        }

    public double getHeight() {
        return height;
        }

    public double getSideC() {
        return sideA;
        }

    public double getSideD() {
        return sideD;
        }

}
