package com.xuyang.springboot.exam.service;

import com.xuyang.springboot.exam.model.UserInfo;
import org.apache.catalina.User;

import java.util.List;

/**
 * @Auther: xuyang
 * @Date: 2019/11/5 00:47
 * @Description:
 */
public interface UserInfoService {

    public UserInfo getUserInfo(User user) throws Exception;

    public List<UserInfo> getUserInfoList(User user) throws Exception;

    public List<UserInfo> getUserInfoList(User user, int startPage, int pageSize) throws Exception;

    public void insertUser(User user) throws Exception;

    public void updateUser(User user) throws Exception;

    public void deleteUser(User user) throws Exception;
}
