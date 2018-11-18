package com.hcs.builder;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/18 21:41
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0F;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
