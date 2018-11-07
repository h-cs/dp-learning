package com.hcs.factory.shape;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 11:45
 */
public class ShapeFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

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
}
