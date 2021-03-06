package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car {



    int speed;

    public Fiat(int speed){
        this.speed=speed;
    }

    public Fiat(int speed, int a){
        this.speed=speed + a;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 7;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 7;
    }
}
