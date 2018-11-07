package com.hcs.abstractfactory.shape;

import com.hcs.abstractfactory.AbstractFactory;
import com.hcs.abstractfactory.color.Color;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 11:45
 */
public class ShapeFactory extends AbstractFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    @Override
    public Shape getShape(String shapeType) {
        Shape shape = null;
        if (CIRCLE.equalsIgnoreCase(shapeType)) {
            shape = new Circle();
        } else if (SQUARE.equalsIgnoreCase(shapeType)) {
            shape = new Square();
        } else if (RECTANGLE.equalsIgnoreCase(shapeType)) {
            shape = new Rectangle();
        } else {
            shape = null;
        }
        return shape;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
