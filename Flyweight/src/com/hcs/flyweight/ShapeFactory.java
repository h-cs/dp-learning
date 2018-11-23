package com.hcs.flyweight;

import java.util.HashMap;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 11:38
 */
public class ShapeFactory {

    public static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }

        return circle;
    }
}
