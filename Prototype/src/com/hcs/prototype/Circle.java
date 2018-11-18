package com.hcs.prototype;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/18 22:13
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle::draw()");
    }
}
