package com.xuyang.springboot.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuyang.springboot.exam.dao.MessageInfoMapper;
import com.xuyang.springboot.exam.model.MessageInfo;
import com.xuyang.springboot.exam.service.MessageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: xuyang
 * @Date: 2019/11/5 00:56
 * @Description:
 */
@Service
@Transactional(transactionManager = "transactional", rollbackFor = Exception.class)
public class MessageInfoServiceImpl implements MessageInfoService {

    @Autowired
    private MessageInfoMapper messageInfoMapper;

    @Override
    public MessageInfo getMessageInfo(MessageInfo messageInfo) throws Exception {
        return messageInfoMapper.getMessageInfo(messageInfo);
    }

    @Override
    public List<MessageInfo> getMessageInfoList(MessageInfo messageInfo) throws Exception {
        return messageInfoMapper.getMessageInfoList(messageInfo);
    }

    @Override
    public List<MessageInfo> getMessageInfoList(MessageInfo messageInfo, int startPage, int pageSize) throws Exception {
        PageHelper.startPage(startPage, pageSize);
        List<MessageInfo> messageInfos = messageInfoMapper.getMessageInfoList(messageInfo);
        PageInfo<MessageInfo> messageInfoPageInfo = new PageInfo<>(messageInfos);
        return messageInfoPageInfo.getList();
    }

    @Override
    public void insertMessageInfo(MessageInfo messageInfo) throws Exception {

    }

    @Override
    public void updateMessageInfo(MessageInfo messageInfo) throws Exception {

    }

    @Override
    public void deleteMessageInfo(MessageInfo messageInfo) throws Exception {

    }
}
