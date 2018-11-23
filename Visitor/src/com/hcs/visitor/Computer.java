package com.hcs.visitor;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 17:59
 */
public class Computer implements ComputerPart {

    ComputerPart[] computerParts;

    public Computer() {
        computerParts = new ComputerPart[] {
                new Mouse(),
                new Keyboard(),
                new Monitor()
        };
    }


    @Override
    public void accecpt(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accecpt(computerPartVisitor);
        }

        computerPartVisitor.visit(this);
    }
}
