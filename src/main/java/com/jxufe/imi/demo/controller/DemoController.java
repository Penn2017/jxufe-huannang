package com.jxufe.imi.demo.controller;

import com.jxufe.imi.demo.service.ServiceTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhongping
 * @date 2017/3/28
 */
@Controller//@Controller代表是控制器
public class DemoController {


    @Resource(name = "serviceTest")
    private ServiceTest serviceTest;

    @RequestMapping("/testMethod")
    public ModelAndView testMethod() {

        ModelAndView modelAndView = new ModelAndView("enableSuccess");

        serviceTest.testMethod();

        modelAndView.addObject("data", "testData");


        return modelAndView;

    }


    /**
     * @RequestMapping("/jsonp") 表示访问路径是：ip:端口号/项目名/jsop
     * @ResponseBody  :表示访问的是一个json数据
     * @return
     */
    @RequestMapping("/jsonp")
    @ResponseBody
    public Map<String,Object> testJsonP(){

        Map<String,Object> map=new HashMap();
        map.put("str", "bb");
        return map;

    }

}
