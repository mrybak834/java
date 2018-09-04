package com.mrybak834.patterns.builder.foodItem;

public class Pepsi extends Drink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
