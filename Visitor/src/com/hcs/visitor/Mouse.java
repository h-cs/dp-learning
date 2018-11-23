package com.hcs.visitor;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 18:00
 */
public class Mouse implements ComputerPart {
    @Override
    public void accecpt(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
