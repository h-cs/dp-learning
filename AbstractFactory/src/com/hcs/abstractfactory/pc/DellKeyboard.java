package com.hcs.abstractfactory.pc;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 14:03
 */
public class DellKeyboard implements Keyboard {
    @Override
    public void showLabel() {
        System.out.println("Dell keyboard");
    }
}
