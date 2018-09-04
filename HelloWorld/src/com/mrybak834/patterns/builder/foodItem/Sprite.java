package com.mrybak834.patterns.builder.foodItem;

public class Sprite extends Drink {
    @Override
    public String name() {
        return "Sprite";
    }

    @Override
    public float price() {
        return 2.1f;
    }
}
