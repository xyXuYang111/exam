package com.xuyang.springboot.exam.model;

import lombok.Data;

@Data
public class CategoryInfo {
    private Integer categoryId;

    private String categoryName;

    private String categoryAlias;

    private String categoryDesc;
}