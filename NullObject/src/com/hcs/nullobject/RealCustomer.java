package com.hcs.nullobject;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 17:32
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
