package com.shivanshu.SOLID.SingleResp.Prblm;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calcTotal() {
        // if calc logic change to add GST or something
        return marker.price * this.quantity;
    }

    // if printing logic has to be changed?
    // this wont suffice Single Responsiblity Principle .i.e. a class should have only one reason to change
    public void printInvoice() {

    }

    public void saveTODB() {

    }
}
