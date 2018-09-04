package com.mrybak834.patterns.builder.foodItem;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
