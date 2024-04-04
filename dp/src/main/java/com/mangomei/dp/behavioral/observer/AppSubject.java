package com.mangomei.dp.behavioral.observer;

import lombok.Data;

/**
 * 应用主题，被观察者
 *
 * @author mango
 * @since 2024/4/4
 */
@Data
public class AppSubject extends Subject {
    private String handler;

    public void setHandler(String handler) {
        notifyObservers(handler);
        this.handler = handler;
    }
}
