package com.mangomei.dp.behavioral.publisher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/**
 * 事件发布者
 *
 * @Author: mango
 * @Date: 2024/4/5 11:32
 */
public class EventPublisher {
    Map<String, List<EventListener>> listenerMap = new HashMap<>();

    /**
     * 添加监听者
     *
     * @param topic 主题
     * @param eventListener 监听者
     */
    public void addListener(String topic, EventListener eventListener) {
        List<EventListener> listenerList = listenerMap.getOrDefault(topic, new ArrayList<>());
        listenerList.add(eventListener);
        listenerMap.put(topic, listenerList);
    }

    /**
     * 移除监听者
     *
     * @param topic 主题
     * @param eventListener 监听者
     */
    public void removeListener(String topic, EventListener eventListener) {
        List<EventListener> listenerList = listenerMap.getOrDefault(topic, new ArrayList<>());
        listenerList.remove(eventListener);
    }

    /**
     * 发布事件
     *
     * @param topic 主题
     * @param event 事件
     */
    public void publishEvent(String topic, Event event) {
        List<EventListener> listenerList = listenerMap.getOrDefault(topic, new ArrayList<>());
        for (EventListener listener : listenerList) {
            listener.onEvent(event);
        }
    }

    /**
     * 发布事件，通过线程池实现异步
     *
     * @param topic 主题
     * @param event 事件
     * @param service 线程池
     */
    public void publishEvent(String topic, Event event, ExecutorService service) {
        List<EventListener> listenerList = listenerMap.getOrDefault(topic, new ArrayList<>());
        for (EventListener listener : listenerList) {
            service.submit(() -> listener.onEvent(event));
        }
    }
}
