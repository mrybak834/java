package com.mrybak834.patterns.builder.foodItem;

import com.mrybak834.patterns.builder.container.Bottle;
import com.mrybak834.patterns.builder.container.Container;

public abstract class Drink implements FoodItem {
    @Override
    public Container pack() {
        return new Bottle();
    }
}
