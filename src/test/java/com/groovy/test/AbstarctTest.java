package com.groovy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhongping
 * @date 2017/5/2
 */
public class AbstarctTest {



    @Test
    public  void test1(){

        List list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
       // list.add(null);


        list.stream().forEach((e)->{
            e.toString();
        });




    }

    public static void main(String[] args) {

      //  ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-look-method-test.xml");
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-config.xml");

        //CommondManager commondManager = (CommondManager) cxt.getBean("commondManager");

        //commondManager.process();
    }

}
