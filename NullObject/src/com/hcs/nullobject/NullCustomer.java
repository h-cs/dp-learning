package com.hcs.nullobject;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 17:33
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database.";
    }
}
