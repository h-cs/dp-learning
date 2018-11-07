package com.hcs.abstractfactory.pc;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 14:01
 */
public class HpFactory implements PcFactory {
    @Override
    public Display createDisplay() {
        return new HpDisplay();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
