package com.hcs.abstractfactory.shape;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 11:44
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
