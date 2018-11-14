package com.hcs.facade;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/14 09:03
 */
public class FacadeTest {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
