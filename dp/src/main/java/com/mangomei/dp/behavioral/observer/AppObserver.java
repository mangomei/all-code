package com.mangomei.dp.behavioral.observer;

/**
 * hello spring
 *
 * @author mango
 * @since 2024/4/4
 */
public class AppObserver implements Observer{
    public void update(Subject subject, Object arg) {
        System.out.println("观察者原数据：" + subject.toString());
        System.out.println("收到状态变化通知，" + arg.toString());
    }
}
