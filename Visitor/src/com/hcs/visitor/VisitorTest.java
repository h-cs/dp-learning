package com.hcs.visitor;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 18:03
 */
public class VisitorTest {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accecpt(new ComputerPartDisplayVisitor());
    }
}
