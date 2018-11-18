package com.hcs.builder;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/18 21:42
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5F;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
