package com.xuyang.springboot.exam.service;

import com.xuyang.springboot.exam.model.MessageInfo;

import java.util.List;

/**
 * @Auther: xuyang
 * @Date: 2019/11/5 00:49
 * @Description:
 */
public interface MessageInfoService {

    public MessageInfo getMessageInfo(MessageInfo messageInfo) throws Exception;

    public List<MessageInfo> getMessageInfoList(MessageInfo messageInfo) throws Exception;

    public List<MessageInfo> getMessageInfoList(MessageInfo messageInfo, int startPage, int pageSize) throws Exception;

    public void insertMessageInfo(MessageInfo messageInfo) throws Exception;

    public void updateMessageInfo(MessageInfo messageInfo) throws Exception;

    public void deleteMessageInfo(MessageInfo messageInfo) throws Exception;
}
