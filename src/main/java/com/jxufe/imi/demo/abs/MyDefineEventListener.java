package com.jxufe.imi.demo.abs;

import org.springframework.context.ApplicationListener;

/**
 * @author zhongping
 * @date 2017/5/2
 */
public class MyDefineEventListener implements ApplicationListener<MyDefineEvent>{
    @Override
    public void onApplicationEvent(MyDefineEvent event) {
        System.out.println("这是个数据源"+event.getSource());
        System.out.println("i got you ....");
    }
}
