package com.hcs.factory.mouse;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 13:52
 */
public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
