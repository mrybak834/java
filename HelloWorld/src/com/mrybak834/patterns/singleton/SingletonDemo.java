package com.mrybak834.patterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingleObject o = SingleObject.getInstance();

        System.out.println(o.getX());

        o.setX(10);

        SingleObject o2 = SingleObject.getInstance();

        System.out.println(o2.getX());
    }
}
