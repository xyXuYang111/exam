package com.xuyang.springboot.exam.controller;

import com.xuyang.springboot.exam.model.ArticleInfo;
import com.xuyang.springboot.exam.service.ArticleInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
    public String articleList(@RequestParam(required = false)ArticleInfo articleInfo, Model model) throws Exception{
        log.debug("文章管理界面");
        List<ArticleInfo> articleInfoList = articleInfoService.getArticleInfoList(articleInfo);
        model.addAttribute("articleInfoList", articleInfoList);
        return "article/article_list";
    }

    @RequestMapping(value = "getArticleAdd", method = RequestMethod.GET)
    public String getArticleAdd(){
        log.debug("文章管理界面");
        return "article/article_add";
    }

    @RequestMapping(value = "getArticleUpdate", method = RequestMethod.GET)
    public String getArticleUpdate(ArticleInfo articleInfo, Model model) throws Exception{
        log.debug("文章管理界面");
        ArticleInfo articleInfoLine = articleInfoService.getArticleInfo(articleInfo);
        model.addAttribute("articleInfo", articleInfoLine);
        return "article/article_update";
    }

    @RequestMapping(value = "articleAdd", method = RequestMethod.POST)
    public String articleAdd(ArticleInfo articleInfo, Model model) throws Exception{
        log.debug("文章管理新增");
        articleInfoService.insertArticleInfo(articleInfo);
        model.addAttribute("articleInfo", articleInfo);
        return "article/article_add";
    }

    @RequestMapping(value = "articleUpdate", method = RequestMethod.POST)
    public String articleUpdate(ArticleInfo articleInfo, Model model) throws Exception{
        log.debug("文章管理新增");
        articleInfoService.updateArticleInfo(articleInfo);
        model.addAttribute("articleInfo", articleInfo);
        return "article/article_update";
    }

    @RequestMapping(value = "articleDelete", method = RequestMethod.GET)
    public String articleDelete(ArticleInfo articleInfo, Model model) throws Exception{
        log.debug("文章管理新增");
        articleInfoService.deleteArticleInfo(articleInfo);
        List<ArticleInfo> articleInfoList = articleInfoService.getArticleInfoList(articleInfo);
        model.addAttribute("articleInfoList", articleInfoList);
        return "article/article_list";
    }
}
