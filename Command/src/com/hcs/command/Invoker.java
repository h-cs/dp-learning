package com.hcs.command;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 16:33
 */
public class Invoker {

    private Command command = null;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
