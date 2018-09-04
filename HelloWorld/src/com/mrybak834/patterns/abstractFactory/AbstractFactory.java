package com.mrybak834.patterns.abstractFactory;

import com.mrybak834.patterns.abstractFactory.color.Color;
import com.mrybak834.patterns.abstractFactory.shape.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
