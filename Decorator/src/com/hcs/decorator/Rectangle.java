package com.hcs.decorator;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/5 22:34
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
