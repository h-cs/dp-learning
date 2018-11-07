package com.hcs.factory.mouse;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 13:51
 */
public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
