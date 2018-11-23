package com.hcs.command;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 16:34
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
