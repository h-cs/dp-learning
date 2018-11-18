package com.hcs.prototype;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/18 22:12
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle::draw()");
    }
}
