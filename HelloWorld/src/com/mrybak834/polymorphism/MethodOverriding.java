package com.mrybak834.polymorphism;

/**
 * Run-time polymorphism, aka dynamic method dispatch
 * In Java, Methods are overriden, data members are hidden.
 *
 */
public class MethodOverriding {
    public static void main(String[] args) {
        Car a = new Car();
        Car b = new Audi();
        Audi c = new Audi();

        a.run(); // Car.run + car speed
        b.run(); // Audi.run + audi speed
        c.run(); // Audi.run + audi speed

        System.out.println(a.speed);            // Car
        System.out.println(b.speed);            // Car
        System.out.println(((Audi) b).speed);   // Audi
        System.out.println(c.speed);            // Audi
    }
}

class Car {
    int speed = 20;
    void run() {
        System.out.println("Car is running at " + this.speed);
    }
}

class Audi extends Car {
    int speed = 200;

    @Override
    void run() {
        System.out.println("Audi is running at " + this.speed);
    }

    /**
     * Won't be available if object is a reference to the superclass
     */
    void superSpeed() { System.out.println("Audi is going superspeed!");}
}