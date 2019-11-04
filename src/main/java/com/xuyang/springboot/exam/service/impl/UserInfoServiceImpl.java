package com.xuyang.springboot.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuyang.springboot.exam.dao.UserInfoMapper;
import com.xuyang.springboot.exam.model.UserInfo;
import com.xuyang.springboot.exam.service.UserInfoService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: xuyang
 * @Date: 2019/11/5 00:53
 * @Description:
 */
@Service
@Transactional(transactionManager = "transactional", rollbackFor = Exception.class)
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfo(User user) throws Exception {
        return userInfoMapper.getUserInfo(user);
    }

    @Override
    public List<UserInfo> getUserInfoList(User user) throws Exception {
        return userInfoMapper.getUserInfoList(user);
    }

    @Override
    public List<UserInfo> getUserInfoList(User user, int startPage, int pageSize) throws Exception {
        PageHelper.startPage(startPage, pageSize);
        List<UserInfo> userInfos = userInfoMapper.getUserInfoList(user);
        PageInfo<UserInfo> userInfoPageInfo = new PageInfo<>(userInfos);
        return userInfoPageInfo.getList();
    }

    @Override
    public void insertUser(User user) throws Exception {
        userInfoMapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) throws Exception {
        userInfoMapper.updateUser(user);
    }

    @Override
    public void deleteUser(User user) throws Exception {
        userInfoMapper.deleteUser(user);
    }
}
