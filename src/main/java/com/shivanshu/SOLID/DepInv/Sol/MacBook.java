package com.shivanshu.SOLID.DepInv.Sol;

// later change to wired then problem
public class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    // constructor inj
    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
