package com.xuyang.springboot.exam.model;

import lombok.Data;

@Data
public class UserInfo {
    private Integer userId;

    private String userName;

    private String userPhone;

    private String userAccount;

    private String userPassword;

    private String userMark;
}