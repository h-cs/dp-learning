package com.hcs.mediator;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 17:05
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}

