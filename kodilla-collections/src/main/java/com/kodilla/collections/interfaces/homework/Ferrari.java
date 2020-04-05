package com.kodilla.collections.interfaces.homework;

public class Ferrari implements Car {

    int speed;

    public Ferrari(int speed){
        this.speed=speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 12;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 9;
    }
}
