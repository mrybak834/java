package com.mrybak834.patterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal nonVeg = builder.prepareNonVegMeal();
        Meal Veg = builder.prepareVegMeal();

        nonVeg.showItems();
        Veg.showItems();

    }
}
