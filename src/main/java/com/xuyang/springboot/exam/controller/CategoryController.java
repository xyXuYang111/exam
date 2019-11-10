package com.xuyang.springboot.exam.controller;

import com.xuyang.springboot.exam.model.CategoryInfo;
import com.xuyang.springboot.exam.service.CategoryInfoService;
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
 * @Date: 2019/11/10 23:44
 * @Description:
 */
@Slf4j
@Controller
public class CategoryController {

    @Autowired
    private CategoryInfoService categoryInfoService;

    @RequestMapping(value = "categoryList", method = RequestMethod.GET)
    public String categoryList(@RequestParam(required = false) CategoryInfo categoryInfo, Model model) throws Exception{
        log.debug("栏目管理界面");
        List<CategoryInfo> categoryInfoList = categoryInfoService.getCategoryInfoList(categoryInfo);
        model.addAttribute("categoryInfoList", categoryInfoList);
        return "category/category";
    }

    @RequestMapping(value = "categoryAdd", method = RequestMethod.POST)
    public String categoryAdd(CategoryInfo categoryInfo, Model model) throws Exception{
        log.debug("栏目管理界面添加");
        categoryInfoService.insertCategoryInfo(categoryInfo);
        List<CategoryInfo> categoryInfoList = categoryInfoService.getCategoryInfoList(categoryInfo);
        model.addAttribute("categoryInfoList", categoryInfoList);
        return "category/category";
    }

    @RequestMapping(value = "getCategoryUpdate", method = RequestMethod.GET)
    public String getCategoryUpdate(CategoryInfo categoryInfo, Model model) throws Exception{
        log.debug("栏目管理界面修改");
        CategoryInfo categoryInfoLine = categoryInfoService.getCategoryInfo(categoryInfo);
        model.addAttribute("categoryInfoLine", categoryInfoLine);
        return "category/category_update";
    }

    @RequestMapping(value = "getCategoryDelete", method = RequestMethod.GET)
    public String categoryDelete(CategoryInfo categoryInfo, Model model) throws Exception{
        log.debug("栏目管理界面添加");
        categoryInfoService.deleteCategoryInfo(categoryInfo);
        List<CategoryInfo> categoryInfoList = categoryInfoService.getCategoryInfoList(categoryInfo);
        model.addAttribute("categoryInfoList", categoryInfoList);
        return "category/category";
    }

    @RequestMapping(value = "categoryUpdate", method = RequestMethod.POST)
    public String categoryUpdate(CategoryInfo categoryInfo, Model model) throws Exception{
        log.debug("栏目管理界面添加");
        categoryInfoService.updateCategoryInfo(categoryInfo);
        model.addAttribute("categoryInfoLine", categoryInfo);
        return "category/category_update";
    }
}
