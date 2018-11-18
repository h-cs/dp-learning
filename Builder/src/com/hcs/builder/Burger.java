package com.hcs.builder;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/18 21:40
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
