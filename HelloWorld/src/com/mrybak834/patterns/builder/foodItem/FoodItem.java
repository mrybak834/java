package com.mrybak834.patterns.builder.foodItem;

import com.mrybak834.patterns.builder.container.Container;

public interface FoodItem {
    String name();
    Container pack();
    float price();
}
