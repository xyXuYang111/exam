package com.xuyang.springboot.exam.dao;

import com.xuyang.springboot.exam.annotation.MyBatisDao;
import com.xuyang.springboot.exam.model.UserInfo;

import org.apache.ibatis.annotations.Param;

@MyBatisDao
public interface UserInfoMapper {

    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserInfo record);

    int updateByExample(@Param("record") UserInfo record);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}