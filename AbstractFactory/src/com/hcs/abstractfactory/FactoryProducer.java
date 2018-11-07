package com.hcs.abstractfactory;


import com.hcs.abstractfactory.color.ColorFactory;
import com.hcs.abstractfactory.shape.ShapeFactory;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 13:33
 */
public class FactoryProducer {

    public static final String SHAPE = "SHAPE";
    public static final String COLOR = "COLOR";

    public static AbstractFactory getFactory(String choice) {
        AbstractFactory factory = null;
        if (SHAPE.equalsIgnoreCase(choice)) {
            factory = new ShapeFactory();
        } else if (COLOR.equalsIgnoreCase(choice)) {
            factory = new ColorFactory();
        }

        return factory;
    }
}
