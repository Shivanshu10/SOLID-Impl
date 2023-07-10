package com.shivanshu.SOLID.OpenExt.Sol;

import com.shivanshu.SOLID.SingleResp.Prblm.Marker;

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
}
