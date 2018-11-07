package com.hcs.factory.mouse;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 13:52
 */
public class MouseFactoryTest {

    public static void main(String[] args) {
        MouseFactory hpMouseFactory = new HpMouseFactory();
        Mouse hpMouse = hpMouseFactory.createMouse();

        MouseFactory dellMouseFactory = new DellMouseFactory();
        Mouse dellMouse = dellMouseFactory.createMouse();

        hpMouse.printLabel();
        dellMouse.printLabel();
    }

}
