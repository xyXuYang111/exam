package com.xuyang.springboot.exam.service;

import com.xuyang.springboot.exam.model.CategoryInfo;

import java.util.List;

/**
 * @Auther: xuyang
 * @Date: 2019/11/5 00:50
 * @Description:
 */
public interface CategoryInfoService {

    public CategoryInfo getCategoryInfo(CategoryInfo categoryInfo) throws Exception;

    public List<CategoryInfo> getCategoryInfoList(CategoryInfo categoryInfo) throws Exception;

    public List<CategoryInfo> getCategoryInfoList(CategoryInfo categoryInfo, int startPage, int pageSize) throws Exception;

    public void insertCategoryInfo(CategoryInfo categoryInfo) throws Exception;

    public void updateCategoryInfo(CategoryInfo categoryInfo) throws Exception;

    public void deleteCategoryInfo(CategoryInfo categoryInfo) throws Exception;
}
