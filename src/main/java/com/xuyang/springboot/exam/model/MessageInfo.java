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
@Document(collection = "MESSAGE_INFO")
public class MessageInfo {

    @Id
    @JsonProperty
    private Integer messageId;

    @Field
    @JsonProperty(value = "messageContent")
    private String messageContent;

    @Field
    @JsonProperty(value = "messageTime")
    private Date messageTime;

    @Field
    @JsonProperty(value = "messageName")
    private String messageName;

    @Field
    @JsonProperty(value = "messageMark")
    private String messageMark;
}