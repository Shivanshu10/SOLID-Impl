package com.shivanshu.SOLID.LiskovSub.Prblm;

// let's say we have a child class Bicycle
// but bicycle doesnt has a turnOnEngine
// so wont sub for parent class
public interface Bike {
    void turnOnEngine();
    void accelerate();
}
