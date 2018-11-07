package com.hcs.abstractfactory.color;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 12:16
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
