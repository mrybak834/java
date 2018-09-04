package com.mrybak834.patterns.decorator;

import com.mrybak834.patterns.decorator.shape.Circle;

public class DecoratorDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        RedShapeDecorator redDecorator = new RedShapeDecorator(c);

        redDecorator.draw();
    }
}
