package com.xuyang.springboot.exam.dao;

import com.xuyang.springboot.exam.annotation.MyBatisDao;
import com.xuyang.springboot.exam.model.CategoryInfo;

import java.util.List;

@MyBatisDao
public interface CategoryInfoMapper {

    public CategoryInfo getCategoryInfo(CategoryInfo categoryInfo) throws Exception;

    public List<CategoryInfo> getCategoryInfoList(CategoryInfo categoryInfo) throws Exception;

    public void insertCategoryInfo(CategoryInfo categoryInfo) throws Exception;

    public void updateCategoryInfo(CategoryInfo categoryInfo) throws Exception;

    public void deleteCategoryInfo(CategoryInfo categoryInfo) throws Exception;
}