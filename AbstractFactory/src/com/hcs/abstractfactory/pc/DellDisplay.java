package com.hcs.abstractfactory.pc;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 14:02
 */
public class DellDisplay implements Display {
    @Override
    public void showAssembler() {
        System.out.println("Dell");
    }
}
