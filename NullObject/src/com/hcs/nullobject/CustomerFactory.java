package com.hcs.nullobject;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 17:34
 */
public class CustomerFactory {

    public static final String[] NAMES = {
            "Rob", "Joe", "Julie"
    };

    public static AbstractCustomer getCustomer(String name) {
        for (String n : NAMES) {
            if (n.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }

        return new NullCustomer();
    }
}
