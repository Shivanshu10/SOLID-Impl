package com.shivanshu.SOLID.OpenExt.Prblm;

public class InvoiceDAO {
    private Invoice invoice;

    public InvoiceDAO(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {

    }

    // new need to save to file also
    // no need to add new method here
    // instead extend
    public void saveToFile() {

    }
}
