package com.jxufe.imi.demo.beanfactoryprocess;

/**
 * @author zhongping
 * @date 2017/5/4
 */
public class NoSuchEventException extends RuntimeException {

    public NoSuchEventException(){

    }
    public NoSuchEventException(String message){
        super(message);
    }
}
