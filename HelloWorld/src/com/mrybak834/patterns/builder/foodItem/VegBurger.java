package com.mrybak834.patterns.builder.foodItem;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veggie Burger";
    }

    @Override
    public float price() {
        return 1.0f;
    }
}
