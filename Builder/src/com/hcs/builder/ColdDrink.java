package com.hcs.builder;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/18 21:41
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
