package com.xuyang.springboot.exam.model;

import lombok.Data;

import java.util.Date;

@Data
public class MessageInfo {
    private Integer messageId;

    private String messageContent;

    private Date messageTime;

    private String messageName;

    private String messageMark;
}