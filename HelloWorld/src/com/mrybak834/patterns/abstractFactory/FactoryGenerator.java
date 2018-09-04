package com.mrybak834.patterns.abstractFactory;

public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory) {
        switch(factory) {
            case "SHAPE": {
                return new ShapeFactory();
            }
            case "COLOR": {
                return new ColorFactory();
            }
            default: {
                return null;
            }
        }
    }
}
