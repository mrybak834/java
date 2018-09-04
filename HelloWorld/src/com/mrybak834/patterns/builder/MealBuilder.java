package com.mrybak834.patterns.builder;

import com.mrybak834.patterns.builder.foodItem.ChickenBurger;
import com.mrybak834.patterns.builder.foodItem.Pepsi;
import com.mrybak834.patterns.builder.foodItem.Sprite;
import com.mrybak834.patterns.builder.foodItem.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Sprite());
        return meal;
    }
}
