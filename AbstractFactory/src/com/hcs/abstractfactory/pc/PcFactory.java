package com.hcs.abstractfactory.pc;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 14:00
 */
public interface PcFactory {
    Display createDisplay();
    Keyboard createKeyboard();
}
