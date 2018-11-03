package com.hcs.observer;

import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/3 11:47
 */
public class BinaryObserver implements Observer {

    public BinaryObserver(Subject subject) {
        subject.register(this);
    }

    public BinaryObserver(List<Subject> subjectList) {
        for (Subject subject : subjectList) {
            subject.register(this);
        }
    }

    @Override
    public void update(Subject subject, String message) {
        System.out.println("[*] message from subject: " + subject.getName());
        System.out.println("[+] message content: " + Integer.toBinaryString(Integer.parseInt(message)));
        System.out.println("-----------");
    }
}
