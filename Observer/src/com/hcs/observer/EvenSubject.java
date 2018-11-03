package com.hcs.observer;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/3 13:09
 */
public class EvenSubject extends Subject {

    private final static Integer BEGIN = 0;

    public EvenSubject() {
        super(BEGIN);
    }

    @Override
    public String getName() {
        return "EvenSubject";
    }
}
