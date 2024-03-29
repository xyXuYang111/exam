package com.xuyang.springboot.exam.dao;

import com.xuyang.springboot.exam.annotation.MyBatisDao;
import com.xuyang.springboot.exam.model.MessageInfo;

import java.util.List;

@MyBatisDao
public interface MessageInfoMapper {

    public MessageInfo getMessageInfo(MessageInfo messageInfo) throws Exception;

    public List<MessageInfo> getMessageInfoList(MessageInfo messageInfo) throws Exception;

    public void insertMessageInfo(MessageInfo messageInfo) throws Exception;

    public void updateMessageInfo(MessageInfo messageInfo) throws Exception;

    public void deleteMessageInfo(MessageInfo messageInfo) throws Exception;
}