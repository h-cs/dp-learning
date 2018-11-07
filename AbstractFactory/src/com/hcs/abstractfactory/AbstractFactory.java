package com.hcs.abstractfactory;

import com.hcs.abstractfactory.color.Color;
import com.hcs.abstractfactory.shape.Shape;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 12:18
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shape);
}
