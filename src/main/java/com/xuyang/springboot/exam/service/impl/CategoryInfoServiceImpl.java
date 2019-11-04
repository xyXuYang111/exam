package com.xuyang.springboot.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuyang.springboot.exam.dao.CategoryInfoMapper;
import com.xuyang.springboot.exam.model.CategoryInfo;
import com.xuyang.springboot.exam.service.CategoryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: xuyang
 * @Date: 2019/11/5 01:00
 * @Description:
 */
@Service
@Transactional(transactionManager = "transactional", rollbackFor = Exception.class)
public class CategoryInfoServiceImpl implements CategoryInfoService {

    @Autowired
    private CategoryInfoMapper categoryInfoMapper;

    @Override
    public CategoryInfo getCategoryInfo(CategoryInfo categoryInfo) throws Exception {
        return categoryInfoMapper.getCategoryInfo(categoryInfo);
    }

    @Override
    public List<CategoryInfo> getCategoryInfoList(CategoryInfo categoryInfo) throws Exception {
        return categoryInfoMapper.getCategoryInfoList(categoryInfo);
    }

    @Override
    public List<CategoryInfo> getCategoryInfoList(CategoryInfo categoryInfo, int startPage, int pageSize) throws Exception {
        PageHelper.startPage(startPage, pageSize);
        List<CategoryInfo> categoryInfos = categoryInfoMapper.getCategoryInfoList(categoryInfo);
        PageInfo<CategoryInfo> categoryInfoPageInfo = new PageInfo<>(categoryInfos);
        return categoryInfoPageInfo.getList();
    }

    @Override
    public void insertCategoryInfo(CategoryInfo categoryInfo) throws Exception {
        categoryInfoMapper.insertCategoryInfo(categoryInfo);
    }

    @Override
    public void updateCategoryInfo(CategoryInfo categoryInfo) throws Exception {
        categoryInfoMapper.updateCategoryInfo(categoryInfo);
    }

    @Override
    public void deleteCategoryInfo(CategoryInfo categoryInfo) throws Exception {
        categoryInfoMapper.deleteCategoryInfo(categoryInfo);
    }
}
