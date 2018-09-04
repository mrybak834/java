package com.mrybak834.patterns.builder.foodItem;

import com.mrybak834.patterns.builder.container.Box;
import com.mrybak834.patterns.builder.container.Container;


public abstract class Burger implements FoodItem {
    @Override
    public Container pack() {
        return new Box();
    }
}
