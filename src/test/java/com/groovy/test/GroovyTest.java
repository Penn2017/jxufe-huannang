package com.groovy.test;

import org.junit.Test;

/**
 * @author zhongping
 * @date 2017/4/27
 */
public class GroovyTest {



    @Test
    public void test(){
        GroovyTest2 test2 = new GroovyTest2();

        System.out.println(test2.method(Object.class));


    }


}
