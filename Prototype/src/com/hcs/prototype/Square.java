package com.hcs.prototype;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/18 22:12
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square::draw()");
    }
}
