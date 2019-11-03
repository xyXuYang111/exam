package com.xuyang.springboot.exam.model;

import lombok.Data;

import java.util.Date;

@Data
public class ArticleInfo {
    private Integer articleId;

    private Integer userId;

    private Integer categoryId;

    private String articleTitle;

    private String articleContent;

    private String articleImg;

    private String articleRecom;

    private Date articleTime;

    private String articleMark;
}