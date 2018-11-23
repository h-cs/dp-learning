package com.hcs.chainofresponsibility;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 13:46
 */
public class ChainOfResponsibilityTest {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "info");
        loggerChain.logMessage(AbstractLogger.DEBUG, "debug");
        loggerChain.logMessage(AbstractLogger.ERROR, "error");
    }
}
