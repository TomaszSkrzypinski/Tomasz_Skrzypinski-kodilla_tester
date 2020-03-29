package com.kodilla.abstracts.homework;

public abstract class Shape {

    private double radius;

    public Shape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    private double side_a;
    private double side_b;

    public Shape(double side_a, double side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public double getSide_a() {
        return side_a;
    }
    public double getSide_b() {
        return side_b;
    }

    private double base;
    private double height;
    private double side_c;
    private double side_d;

    public Shape(double base, double height, double side_c, double side_d) {
        this.base = base;
        this.height = height;
        this.side_c = side_c;
        this.side_d = side_d;
    }

    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    public double getSide_c() {
        return side_a;
    }
    public double getSide_d() {
        return side_d;
    }


    public abstract void polePow();

    public abstract void obwód();
}
