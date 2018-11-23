package com.hcs.chainofresponsibility;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 13:45
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
