package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ferrari implements Car {

    int speed;

    public Ferrari(int speed){
        this.speed=speed;
    }

    public Ferrari(int speed, int a){
        this.speed=speed + a;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ferrari ferrari = (Ferrari) o;
        return speed == ferrari.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
