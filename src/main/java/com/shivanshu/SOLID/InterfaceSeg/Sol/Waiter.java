package com.shivanshu.SOLID.InterfaceSeg.Sol;

// interfaces should not be such that client should implement unnecessary function
public class Waiter implements WaiterInterface {

    @Override
    public void serveCustomers() {
        System.out.println("serving customers");
    }

    @Override
    public void takeOrders() {
        System.out.println("Taking orders");
    }
}
