package com.jxufe.imi.demo.service;

import org.springframework.stereotype.Service;

/**
 * @author zhongping
 * @date 2017/3/28
 */
@Service("serviceTest")//@Service代表逻辑实现成
public class ServiceTest {



    public void testMethod(){
        System.out.println("this is test Method...");

    }
}
