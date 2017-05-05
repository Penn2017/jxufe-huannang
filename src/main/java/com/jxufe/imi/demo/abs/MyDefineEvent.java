package com.jxufe.imi.demo.abs;

import org.springframework.context.ApplicationEvent;

/**
 * @author zhongping
 * @date 2017/5/2
 */
public class MyDefineEvent  extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyDefineEvent(Object source) {
        super(source);
        System.out.println("创建一个事件。。。。");
    }
}
