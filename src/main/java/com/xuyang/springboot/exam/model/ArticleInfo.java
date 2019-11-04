package com.xuyang.springboot.exam.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Slf4j
@Document(collection = "ARTICLE_INFO")
public class ArticleInfo {

    @Id
    @JsonProperty
    private Integer articleId;

    @Field
    @JsonProperty(value = "userId")
    private Integer userId;

    @Field
    @JsonProperty(value = "categoryId")
    private Integer categoryId;

    @Field
    @JsonProperty(value = "articleTitle")
    private String articleTitle;

    @Field
    @JsonProperty(value = "articleContent")
    private String articleContent;

    @Field
    @JsonProperty(value = "articleImg")
    private String articleImg;

    @Field
    @JsonProperty(value = "articleRecom")
    private String articleRecom;

    @Field
    @JsonProperty(value = "articleTime")
    private Date articleTime;

    @Field
    @JsonProperty(value = "articleMark")
    private String articleMark;
}