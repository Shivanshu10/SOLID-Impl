package com.shivanshu.SOLID.InterfaceSeg.Prblm;

// interfaces should not be such that client should implement unnecessary function
public class Waiter implements RestaurantEmployee {
    @Override
    public void washDish() {
        // not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("serving customers");
    }

    @Override
    public void cookFood() {
        // not my job
    }
}
