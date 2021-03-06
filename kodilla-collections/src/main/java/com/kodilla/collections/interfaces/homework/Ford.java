package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    int speed;

    public Ford(int speed){
        this.speed=speed;
    }

    public Ford(int speed, int a){
        this.speed=speed + a;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 8;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 6;
    }
}
