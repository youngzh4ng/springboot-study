package com.test.springboot.listener;

import com.test.springboot.listener.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("Get Event: " + myEvent.getClass());
    }
}
