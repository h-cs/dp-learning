package com.hcs.proxy;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/18 20:59
 */
public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);

        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);

        proxyClass.sellBooks();
        proxyClass.speak();
    }
}
