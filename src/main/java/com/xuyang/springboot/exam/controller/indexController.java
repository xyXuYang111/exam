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

    @RequestMapping(value = "back/index", method = RequestMethod.GET)
    public String backIndex(){
        log.debug("测试集成情况");
        return "index";
    }

    @RequestMapping(value = "back/main", method = RequestMethod.GET)
    public String main(){
        log.debug("数据统计界面");
        return "main";
    }

    @RequestMapping(value = "back/categoryList", method = RequestMethod.GET)
    public String categoryList(){
        log.debug("栏目管理界面");
        return "category/category";
    }

    @RequestMapping(value = "back/articleList", method = RequestMethod.GET)
    public String articleList(){
        log.debug("文章管理界面");
        return "article/article_list";
    }

    @RequestMapping(value = "back/messageList", method = RequestMethod.GET)
    public String messageList(){
        log.debug("留言管理界面");
        return "message/message_list";
    }

    @RequestMapping(value = "back/userList", method = RequestMethod.GET)
    public String userList(){
        log.debug("用户管理界面");
        return "userinfo/userinfo_list";
    }

    @RequestMapping(value = "back/login", method = RequestMethod.GET)
    public String login(){
        log.debug("登录界面");
        return "login";
    }
}
