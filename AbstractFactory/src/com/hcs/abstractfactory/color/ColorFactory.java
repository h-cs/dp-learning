package com.hcs.abstractfactory.color;


import com.hcs.abstractfactory.AbstractFactory;
import com.hcs.abstractfactory.shape.Shape;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 13:31
 */
public class ColorFactory extends AbstractFactory {

    public static final String RED = "RED";
    public static final String GREEN = "GREEN";
    public static final String BLUE = "BLUE";


    @Override
    public Color getColor(String colorType) {
        Color color = null;
        if (RED.equalsIgnoreCase(colorType)) {
            color = new Red();
        } else if (GREEN.equalsIgnoreCase(colorType)) {
            color = new Green();
        } else if (BLUE.equalsIgnoreCase(colorType)) {
            color = new Blue();
        }

        return color;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
