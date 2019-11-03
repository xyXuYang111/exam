package com.xuyang.springboot.exam.dao;

import com.xuyang.springboot.exam.annotation.MyBatisDao;
import com.xuyang.springboot.exam.model.CategoryInfo;

import org.apache.ibatis.annotations.Param;

@MyBatisDao
public interface CategoryInfoMapper {

    int deleteByPrimaryKey(Integer categoryId);

    int insert(CategoryInfo record);

    int insertSelective(CategoryInfo record);

    CategoryInfo selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") CategoryInfo record);

    int updateByExample(@Param("record") CategoryInfo record);

    int updateByPrimaryKeySelective(CategoryInfo record);

    int updateByPrimaryKey(CategoryInfo record);
}