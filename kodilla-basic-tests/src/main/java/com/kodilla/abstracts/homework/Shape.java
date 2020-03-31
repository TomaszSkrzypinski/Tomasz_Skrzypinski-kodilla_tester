package com.kodilla.abstracts.homework;

public abstract class Shape {

    private double radius;
    private double sideA;
    private double sideB;
    private double base;
    private double height;

    public Shape(double radius) {
        this.radius = radius;
        }

    public Shape(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        }

    public Shape(double base, double height, double sideA, double sideB) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
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

}
