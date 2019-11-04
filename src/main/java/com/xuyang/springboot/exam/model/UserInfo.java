package com.xuyang.springboot.exam.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Slf4j
@Document(collection = "USER_INFO")
public class UserInfo {

    @Id
    @JsonProperty
    private Integer userId;

    @Field
    @JsonProperty(value = "userName")
    private String userName;

    @Field
    @JsonProperty(value = "userPhone")
    private String userPhone;

    @Field
    @JsonProperty(value = "userAccount")
    private String userAccount;

    @Field
    @JsonProperty(value = "userPassword")
    private String userPassword;

    @Field
    @JsonProperty(value = "userMark")
    private String userMark;
}