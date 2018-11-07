package com.hcs.abstractfactory.shape;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 11:43
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
