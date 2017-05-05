package com.jxufe.imi.demo.abs;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author zhongping
 * @date 2017/5/2
 */
public class MyCommend  implements ApplicationEventPublisherAware {


    ApplicationEventPublisher aep;

    public void execute(){
        aep.publishEvent(new MyDefineEvent("我就是源"));

    }



    public MyCommend createCommend(){
        return new MyCommend();
    }


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher a) {
        aep=a;
    }
}
