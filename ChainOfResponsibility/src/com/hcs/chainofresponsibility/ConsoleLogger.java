package com.hcs.chainofresponsibility;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 13:42
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console::Logger: " + message);
    }
}
