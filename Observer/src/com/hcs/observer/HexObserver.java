package com.hcs.observer;

import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/3 11:57
 */
public class HexObserver implements Observer {

    public HexObserver(Subject subject) {
        subject.register(this);
    }

    public HexObserver(List<Subject>subjectList) {
        for (Subject subject : subjectList) {
            subject.register(this);
        }
    }

    @Override
    public void update(Subject subject, String message) {
        System.out.println("[*] message from subject: " + subject.getName());
        System.out.println("[+] message content: " + Integer.toHexString(Integer.parseInt(message)));
        System.out.println("-----------");
    }
}
