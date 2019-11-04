package com.xuyang.springboot.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuyang.springboot.exam.dao.ArticleInfoMapper;
import com.xuyang.springboot.exam.model.ArticleInfo;
import com.xuyang.springboot.exam.service.ArticleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: xuyang
 * @Date: 2019/11/5 01:02
 * @Description:
 */
@Service
@Transactional(transactionManager = "transactional", rollbackFor = Exception.class)
public class ArticleInfoServiceImpl implements ArticleInfoService {

    @Autowired
    private ArticleInfoMapper articleInfoMapper;

    @Override
    public ArticleInfo getArticleInfo(ArticleInfo articleInfo) throws Exception {
        return articleInfoMapper.getArticleInfo(articleInfo);
    }

    @Override
    public List<ArticleInfo> getArticleInfoList(ArticleInfo articleInfo) throws Exception {
        return articleInfoMapper.getArticleInfoList(articleInfo);
    }

    @Override
    public List<ArticleInfo> getArticleInfoList(ArticleInfo articleInfo, int startPage, int pageSize) throws Exception {
        PageHelper.startPage(startPage, pageSize);
        List<ArticleInfo> articleInfos = articleInfoMapper.getArticleInfoList(articleInfo);
        PageInfo<ArticleInfo> articleInfoPageInfo = new PageInfo<>(articleInfos);
        return articleInfoPageInfo.getList();
    }

    @Override
    public void insertArticleInfo(ArticleInfo articleInfo) throws Exception {
        articleInfoMapper.insertArticleInfo(articleInfo);
    }

    @Override
    public void updateArticleInfo(ArticleInfo articleInfo) throws Exception {
        articleInfoMapper.updateArticleInfo(articleInfo);
    }

    @Override
    public void deleteArticleInfo(ArticleInfo articleInfo) throws Exception {
        articleInfoMapper.deleteArticleInfo(articleInfo);
    }
}
