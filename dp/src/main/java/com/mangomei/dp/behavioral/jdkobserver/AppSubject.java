package com.mangomei.dp.behavioral.jdkobserver;

import lombok.Data;

import java.util.Observable;

/**
 * 应用主题，被观察者
 *
 * @author mango
 * @since 2024/4/4
 */
@Data
public class AppSubject extends Observable {
    private String handler;

    public void setHandler(String handler) {
        setChanged();
        notifyObservers(handler);
        this.handler = handler;
    }
}
