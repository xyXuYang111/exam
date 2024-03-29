package com.xuyang.springboot.exam.dao;

import com.xuyang.springboot.exam.annotation.MyBatisDao;
import com.xuyang.springboot.exam.model.ArticleInfo;

import java.util.List;

@MyBatisDao
public interface ArticleInfoMapper {

    public ArticleInfo getArticleInfo(ArticleInfo articleInfo) throws Exception;

    public List<ArticleInfo> getArticleInfoList(ArticleInfo articleInfo) throws Exception;

    public void insertArticleInfo(ArticleInfo articleInfo) throws Exception;

    public void updateArticleInfo(ArticleInfo articleInfo) throws Exception;

    public void deleteArticleInfo(ArticleInfo articleInfo) throws Exception;
}