package com.xuanyu.webservice.service.impl;

import com.xuanyu.webservice.dao.User;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private Map<Long , User> userMap = new HashMap<Long,User>();

    public UserServiceImpl(){
        User user = new User();
        user.setUserId(10086L);
        user.setUserName("李青");
        user.setUserEmail("77777@qq.com");
        user.setUserDate(new Date());
        userMap.put(user.getUserId(),user);

        user = new User();
        user.setUserId(2000L);
        user.setUserName("嘉文四世");
        user.setUserEmail("88888@163.com");
        user.setUserDate(new Date());
        userMap.put(user.getUserId(),user);

        user = new User();
        user.setUserId(9999L);
        user.setUserName("格雷福斯");
        user.setUserEmail("999999@gmail.com");
        user.setUserDate(new Date());
        userMap.put(user.getUserId(),user);
    }
    @Override
    public String getName(Long userId){
        return "7777"+userId;
    }

    @Override
    public User getUser(Long userId){
        return userMap.get(userId);
    }
}




