package com.jxufe.imi.demo.abs;

/**
 * @author zhongping
 * @date 2017/5/2
 */
public abstract class CommondManager {


    public void process() {

        MyCommend myCommend = getCommendFromOther();

        myCommend.execute();


    }


    public abstract MyCommend getCommendFromOther();
}
