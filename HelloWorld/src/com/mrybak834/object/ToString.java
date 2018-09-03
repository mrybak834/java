package com.mrybak834.object;

public class ToString {
    public static void main(String[] args) {
        Car c = new Car(4, "Viper");

        System.out.println(c.toString());
    }
}

class Car {
    private int wheels;
    private String name;

    Car(int wheels, String name) {
        this.wheels = wheels;
        this.name = name;
    }

    @Override
    public String toString() {
        return "The car has " + wheels + " wheels, and is named " + name;
    }
}
