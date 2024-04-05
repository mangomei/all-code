package com.mangomei.dp.behavioral.publisher;

/**
 * 事件监听者
 *
 * @Author: mango
 * @Date: 2024/4/5 11:29
 */
public interface EventListener<T> {
    /**
     * 监听事件
     *
     * @param arg 数据
     */
    void onEvent(T arg);
}
