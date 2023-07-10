package com.shivanshu.SOLID.DepInv.Prblm;

import javax.crypto.Mac;

// later change to wired then problem
public class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBook() {
        keyboard = new WiredKeyboard();
        mouse = new WiredMouse();
    }
}
