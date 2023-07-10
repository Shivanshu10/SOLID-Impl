package com.shivanshu.SOLID.LiskovSub.Prblm;

public class MotorCycle implements Bike {
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed += 10;
    }
}
