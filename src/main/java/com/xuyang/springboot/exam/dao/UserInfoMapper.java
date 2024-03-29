package com.xuyang.springboot.exam.dao;

import com.xuyang.springboot.exam.annotation.MyBatisDao;
import com.xuyang.springboot.exam.model.UserInfo;
import org.apache.catalina.User;

import java.util.List;

@MyBatisDao
public interface UserInfoMapper {

    public UserInfo getUserInfo(User user) throws Exception;

    public List<UserInfo> getUserInfoList(User user) throws Exception;

    public void insertUser(User user) throws Exception;

    public void updateUser(User user) throws Exception;

    public void deleteUser(User user) throws Exception;
}