package com.hcs.observer;

import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/3 11:56
 */
public class OctalObserver implements Observer {

    public OctalObserver(Subject subject) {
        subject.register(this);
    }

    public OctalObserver(List<Subject> subjectList) {
        for (Subject subject : subjectList) {
            subject.register(this);
        }
    }

    @Override
    public void update(Subject subject, String message) {
        System.out.println("[*] message from subject: " + subject.getName());
        System.out.println("[+] message content: " + Integer.toOctalString(Integer.parseInt(message)));
        System.out.println("-----------");
    }
}
