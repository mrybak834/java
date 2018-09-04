package com.mrybak834.patterns.factory;

public class ShapeFactory {
    public Shape getShape(String shape) {
        switch(shape) {
            case "Circle": {
                return new Circle();
            }
            case "Square": {
                return new Square();
            }
            case "Rectangle": {
                return new Rectangle();
            }
            default: {
                return new Circle();
            }
        }
    }
}
