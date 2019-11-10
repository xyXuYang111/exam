package com.xuyang.springboot.exam.controller;

import com.xuyang.springboot.exam.model.ArticleInfo;
import com.xuyang.springboot.exam.service.ArticleInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: xuyang
 * @Date: 2019/11/11 01:36
 * @Description:
 */
@Slf4j
@Controller
public class ArticleController {

    @Autowired
    private ArticleInfoService articleInfoService;

    @RequestMapping(value = "articleList", method = RequestMethod.GET)
    public String articleList(@RequestParam(required = false)ArticleInfo articleInfo){
        log.debug("文章管理界面");
        return "article/article_list";
    }

    @RequestMapping(value = "getArticleAdd", method = RequestMethod.GET)
    public String getArticleAdd(){
        log.debug("文章管理界面");
        return "article/article_add";
    }
}
