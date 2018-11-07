package com.hcs.abstractfactory;

import com.hcs.abstractfactory.color.Color;
import com.hcs.abstractfactory.color.ColorFactory;
import com.hcs.abstractfactory.shape.Shape;
import com.hcs.abstractfactory.shape.ShapeFactory;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 13:35
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryProducer.SHAPE);
        Shape circle = shapeFactory.getShape(ShapeFactory.CIRCLE);
        Shape square = shapeFactory.getShape(ShapeFactory.SQUARE);
        Shape rectangle = shapeFactory.getShape(ShapeFactory.RECTANGLE);
        circle.draw();
        square.draw();
        rectangle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryProducer.COLOR);
        Color red = colorFactory.getColor(ColorFactory.RED);
        Color green = colorFactory.getColor(ColorFactory.GREEN);
        Color blue = colorFactory.getColor(ColorFactory.BLUE);
        red.fill();
        green.fill();
        blue.fill();
    }

}
