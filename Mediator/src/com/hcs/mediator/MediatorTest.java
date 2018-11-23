package com.hcs.mediator;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 17:06
 */
public class MediatorTest {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");

    }
}
