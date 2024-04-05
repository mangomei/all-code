package com.mangomei.dp.behavioral.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 应用观察者
 *
 * @author mango
 * @since 2024/4/4
 */
public class AppObserver implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println("观察者原数据：" + o.toString());
        System.out.println("收到状态变化通知，" + arg.toString());
    }
}
