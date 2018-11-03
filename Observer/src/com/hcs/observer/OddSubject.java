package com.hcs.observer;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/3 13:05
 */
public class OddSubject extends Subject {

    private final static Integer BEGIN = 1;

    public OddSubject() {
        super(BEGIN);
    }

    @Override
    public String getName() {
        return "OddSubject";
    }
}
