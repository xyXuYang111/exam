package com.xuyang.springboot.exam.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Slf4j
@Document(collection = "CATEGORY_INFO")
public class CategoryInfo {

    @Id
    @JsonProperty
    private Integer categoryId;

    @Field
    @JsonProperty(value = "categoryName")
    private String categoryName;

    @Field
    @JsonProperty(value = "categoryAlias")
    private String categoryAlias;

    @Field
    @JsonProperty(value = "categoryDesc")
    private String categoryDesc;
}