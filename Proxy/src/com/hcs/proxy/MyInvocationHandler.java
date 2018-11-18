package com.hcs.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/18 20:56
 */
public class MyInvocationHandler implements InvocationHandler {

    Subject realSubject;

    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类.");
        if ("sellBooks".equals(method.getName())) {
            int invoke = (int) method.invoke(realSubject, args);
            System.out.println("调用的是卖书的方法.");
            return invoke;
        } else {
            String string = (String) method.invoke(realSubject, args);
            System.out.println("调用的是说话的方法.");
            return string;
        }
    }
}
