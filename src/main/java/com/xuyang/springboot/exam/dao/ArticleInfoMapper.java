package com.xuyang.springboot.exam.dao;

import com.xuyang.springboot.exam.annotation.MyBatisDao;
import com.xuyang.springboot.exam.model.ArticleInfo;

import org.apache.ibatis.annotations.Param;

@MyBatisDao
public interface ArticleInfoMapper {

    int deleteByPrimaryKey(Integer articleId);

    int insert(ArticleInfo record);

    int insertSelective(ArticleInfo record);

    ArticleInfo selectByPrimaryKey(Integer articleId);

    int updateByExampleSelective(@Param("record") ArticleInfo record);

    int updateByExample(@Param("record") ArticleInfo record);

    int updateByPrimaryKeySelective(ArticleInfo record);

    int updateByPrimaryKey(ArticleInfo record);
}