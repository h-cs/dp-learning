package com.hcs.abstractfactory.color;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 12:17
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
