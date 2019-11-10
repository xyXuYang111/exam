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
public class IndexController {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(){
        log.debug("测试集成情况");
        return "index";
    }

    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String main(){
        log.debug("数据统计界面");
        return "main";
    }

    @RequestMapping(value = "messageList", method = RequestMethod.GET)
    public String messageList(){
        log.debug("留言管理界面");
        return "message/message_list";
    }

    @RequestMapping(value = "userList", method = RequestMethod.GET)
    public String userList(){
        log.debug("用户管理界面");
        return "userinfo/userinfo_list";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(){
        log.debug("登录界面");
        return "login";
    }
}
