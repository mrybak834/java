package com.mrybak834.patterns.factory;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();

        Shape s = factory.getShape("CIRCLE");

        s.draw();
    }
}
