package com.hcs.abstractfactory.pc;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 14:04
 */
public class DellFactory implements PcFactory {
    @Override
    public Display createDisplay() {
        return new DellDisplay();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
