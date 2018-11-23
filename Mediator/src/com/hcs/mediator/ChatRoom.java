package com.hcs.mediator;

import java.util.Date;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 17:04
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "] : " + message);
    }
}
