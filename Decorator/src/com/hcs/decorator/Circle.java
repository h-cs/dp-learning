package com.hcs.decorator;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/5 22:35
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
