package com.mrybak834.patterns.abstractFactory;

import com.mrybak834.patterns.abstractFactory.color.Color;
import com.mrybak834.patterns.abstractFactory.shape.Circle;
import com.mrybak834.patterns.abstractFactory.shape.Rectangle;
import com.mrybak834.patterns.abstractFactory.shape.Shape;
import com.mrybak834.patterns.abstractFactory.shape.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "CIRCLE": {
                return new Circle();
            }
            case "SQUARE": {
                return new Square();
            }
            case "RECTANGLE": {
                return new Rectangle();
            }
            default: {
                return new Circle();
            }
        }
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
