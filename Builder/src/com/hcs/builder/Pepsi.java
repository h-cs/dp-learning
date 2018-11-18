package com.hcs.builder;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/18 21:43
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0F;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
