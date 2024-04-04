package com.mangomei.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察对象抽象类
 *
 * @author mango
 * @since 2024/4/4
 */
public abstract class Subject {
    /**
     * 存放注册的观察者列表
     */
    List<Observer> observerList;

    public Subject() {
        this.observerList = new ArrayList<Observer>();
    }

    /**
     * 添加/注册观察者
     *
     * @param observer 观察者
     */
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer 观察者
     */
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * 通知所有观察者，并传递参数
     */
    public void notifyObservers(Object obj) {
        for (Observer observer : observerList) {
            observer.update(this, obj);
        }
    }
}
