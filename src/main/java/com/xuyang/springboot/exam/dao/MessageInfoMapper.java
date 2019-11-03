package com.xuyang.springboot.exam.dao;

import com.xuyang.springboot.exam.annotation.MyBatisDao;
import com.xuyang.springboot.exam.model.MessageInfo;

import org.apache.ibatis.annotations.Param;

@MyBatisDao
public interface MessageInfoMapper {

    int deleteByPrimaryKey(Integer messageId);

    int insert(MessageInfo record);

    int insertSelective(MessageInfo record);
    MessageInfo selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") MessageInfo record);

    int updateByExample(@Param("record") MessageInfo record);

    int updateByPrimaryKeySelective(MessageInfo record);

    int updateByPrimaryKey(MessageInfo record);
}