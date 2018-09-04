package com.mrybak834.patterns.singleton;

public class SingleObject {
    private static SingleObject o = new SingleObject();
    private static int x = 10;

    private SingleObject(){};

    public static SingleObject getInstance() {
        return o;
    }

    public void setX(int x) {
        x = x;
    }

    public int getX() {
        return x;
    }
}
