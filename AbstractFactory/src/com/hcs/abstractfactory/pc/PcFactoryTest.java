package com.hcs.abstractfactory.pc;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 14:04
 */
public class PcFactoryTest {
    public static void main(String[] args) {
        PcFactory hpFactory = new HpFactory();
        PcFactory dellFactory = new DellFactory();

        Display hpDisplay = hpFactory.createDisplay();
        Keyboard hpKeyboard = hpFactory.createKeyboard();
        hpDisplay.showAssembler();
        hpKeyboard.showLabel();

        Display dellDisplay = dellFactory.createDisplay();
        Keyboard dellKeyboard = dellFactory.createKeyboard();
        dellDisplay.showAssembler();
        dellKeyboard.showLabel();


    }
}
