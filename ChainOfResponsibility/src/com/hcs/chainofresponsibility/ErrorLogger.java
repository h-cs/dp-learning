package com.hcs.chainofresponsibility;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 13:43
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger: " + message);
    }
}
