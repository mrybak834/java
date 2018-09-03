package com.mrybak834.interfaces;

public class Animal {
    private int size;
    private String name;

    Animal(int size, String name) {
        this.size = size;
        this.name = name;
    }
}

interface Talk {
    void speak(String sentence);
}

interface Fly {
    void ascend();
    void descend();
}

class Dog extends Animal implements Talk {
    Dog(int size, String name) {
        super(size, name);
    }

    @Override
    public void speak(String sentence) {
        System.out.println("Dog says: " + sentence);
    }

    public void rollOver() {
        System.out.println("Rolled over");
    }
}

class Bird extends Animal implements Talk, Fly {
    Bird(int size, String name) {
        super(size, name);
    }

    @Override
    public void speak(String sentence) {
        System.out.println("Bird says: " + sentence);
    }

    @Override
    public void ascend() {

    }

    @Override
    public void descend() {

    }
}

class Main {
    public static void main(String[] args) {
        Talk t = new Dog(5, "Talker");
        // t.rollOver(); won't work, it can only talk


        Dog d = new Dog(6, "Sparky");
        Bird b = new Bird(1, "Moon");
    }
}
