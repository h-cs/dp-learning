package com.hcs.command;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 16:32
 */
public class ConcreteCommand implements Command {

    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
