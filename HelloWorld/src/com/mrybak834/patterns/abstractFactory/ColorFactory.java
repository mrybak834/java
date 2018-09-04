package com.mrybak834.patterns.abstractFactory;

import com.mrybak834.patterns.abstractFactory.color.Blue;
import com.mrybak834.patterns.abstractFactory.color.Color;
import com.mrybak834.patterns.abstractFactory.color.Green;
import com.mrybak834.patterns.abstractFactory.color.Red;
import com.mrybak834.patterns.abstractFactory.shape.Shape;

public class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        switch (color) {
            case "RED": {
                return new Red();
            }
            case "GREEN": {
                return new Green();
            }
            case "BLUE": {
                return new Blue();
            }
            default: {
                return new Red();
            }
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
