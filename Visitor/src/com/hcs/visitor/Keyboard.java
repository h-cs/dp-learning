package com.hcs.visitor;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 17:57
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accecpt(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
