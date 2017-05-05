package com.jxufe.imi.demo.service;

import com.jxufe.imi.demo.SpringTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhongping
 * @date 2017/5/4
 */

@Component
public class AnotitonTest {


    @Autowired(required = false)
    private SpringTest test;




    public void setSpringTest(SpringTest s){
        this.test=s;
    }



}
