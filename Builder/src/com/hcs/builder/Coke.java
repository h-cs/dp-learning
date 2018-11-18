package com.hcs.builder;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/18 21:43
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.3F;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
