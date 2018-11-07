package com.hcs.abstractfactory.pc;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 14:00
 */
public interface PcFactory {

    /**
     * 生产显示器
     * @return
     */
    Display createDisplay();

    /**
     * 生产键盘
     * @return
     */
    Keyboard createKeyboard();
}
