package com.mangomei.dp.behavioral.publisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.concurrent.Executors;

/**
 * 应用程序
 *
 * @Author: mango
 * @Date: 2024/4/5 11:45
 */
public class Application {
    public static void main(String[] args) {
        EventPublisher publisher = new EventPublisher();
        publisher.addListener("topic1", new Topic1Listener());
        publisher.addListener("topic2", new Topic2Listener());
        Event event = new Event("测试数据");
        publisher.publishEvent("topic1", event);
        event.setMessage("新的测试数据");
        publisher.publishEvent("topic2", event, Executors.newFixedThreadPool(1));
    }
}

class Topic1Listener implements EventListener<Event> {

    @Override
    public void onEvent(Event event) {
        System.out.println("topic1 收到消息：" + event.toString());
    }
}

class Topic2Listener implements EventListener<Event> {

    @Override
    public void onEvent(Event arg) {
        System.out.println("topic2 收到消息：" + arg.toString());
    }
}

@ToString
@Data
@AllArgsConstructor
class Event {
    private String message;
}
