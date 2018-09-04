package com.mrybak834.patterns.builder;

import com.mrybak834.patterns.builder.foodItem.FoodItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Meal {
    private ArrayList<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public float getCost() {
        Iterator<FoodItem> i = items.iterator();

        float cost = 0f;
        while(i.hasNext()) {
            cost += i.next().price();
        }

        return cost;
    }

    public void showItems() {
        System.out.println("Meal: ");
        for (FoodItem item : items) {
            System.out.println("Item: " + item.name() + ", Container: " + item.pack().pack() + ", Price: " + item.price());
        }
        System.out.println();
    }
}
