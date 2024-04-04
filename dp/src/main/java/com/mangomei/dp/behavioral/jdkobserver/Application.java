package com.mangomei.dp.behavioral.jdkobserver;

/**
 * 观察者模式主程序
 *
 * @author mango
 * @since 2024/4/4
 */
public class Application {

    public static void main(String[] args) {
        AppSubject appSubject = new AppSubject();
        appSubject.addObserver(new AppObserver());
        appSubject.setHandler("新的数据");
        appSubject.setHandler("新的数据2");
    }
}
