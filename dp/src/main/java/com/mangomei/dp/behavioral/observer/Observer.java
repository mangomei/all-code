package com.mangomei.dp.behavioral.observer;

/**
 * 观察者接口
 *
 * @author mango
 * @since 2024/4/4
 */
public interface Observer {
    /**
     * 当被观察者subject状态发生变化时，会依次通知观察者的update方法
     *
     * @param subject 被观察者
     * @param arg 通知时传入的参数
     */
    void update(Subject subject, Object arg);
}
