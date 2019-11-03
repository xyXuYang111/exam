package com.xuyang.springboot.exam.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: xuyang
 * @Date: 2019/11/3 22:07
 * @Description:
 */
@Slf4j
@Controller
public class indexController {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(){
        log.debug("测试集成情况");
        return "index";
    }
}
