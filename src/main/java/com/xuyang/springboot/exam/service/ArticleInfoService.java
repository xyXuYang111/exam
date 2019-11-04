package com.xuyang.springboot.exam.service;

import com.xuyang.springboot.exam.model.ArticleInfo;

import java.util.List;

/**
 * @Auther: xuyang
 * @Date: 2019/11/5 00:51
 * @Description:
 */
public interface ArticleInfoService {

    public ArticleInfo getArticleInfo(ArticleInfo articleInfo) throws Exception;

    public List<ArticleInfo> getArticleInfoList(ArticleInfo articleInfo) throws Exception;

    public List<ArticleInfo> getArticleInfoList(ArticleInfo articleInfo, int startPage, int pageSize) throws Exception;

    public void insertArticleInfo(ArticleInfo articleInfo) throws Exception;

    public void updateArticleInfo(ArticleInfo articleInfo) throws Exception;

    public void deleteArticleInfo(ArticleInfo articleInfo) throws Exception;
}
