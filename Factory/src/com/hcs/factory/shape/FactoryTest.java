package com.hcs.factory.shape;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 11:49
 */
public class FactoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeFactory.CIRCLE);
        Shape square = shapeFactory.getShape(ShapeFactory.SQUARE);
        Shape rectangle = shapeFactory.getShape(ShapeFactory.RECTANGLE);

        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
