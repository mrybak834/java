package com.mrybak834.patterns.abstractFactory;

import com.mrybak834.patterns.abstractFactory.color.Color;
import com.mrybak834.patterns.abstractFactory.shape.Shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args){

        AbstractFactory shapeFactory = FactoryGenerator.getFactory("SHAPE");
        Shape s = shapeFactory.getShape("CIRCLE");
        s.draw();

        AbstractFactory colorFactory = FactoryGenerator.getFactory("COLOR");
        Color r = colorFactory.getColor("RED");
        r.fill();
    }
}
