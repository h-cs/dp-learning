package com.hcs.observer;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/3 11:42
 */
public interface Observer {

    /**
     * 观察者暴露给主题的更新操作接口，当主题有内容更新时，调用此方法来更新观察者
     *
     * @param subject 记录更新操作来自哪一个主题
     * @param message 消息
     */
    void update(Subject subject, String message);
}
