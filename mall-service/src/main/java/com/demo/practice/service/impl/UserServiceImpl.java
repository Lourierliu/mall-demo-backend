package com.demo.practice.service.impl;

import com.demo.practice.common.entity.dos.UserDO;
import com.demo.practice.dao.mysql.UserMapper;
import com.demo.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDO getUser(int id) {
        return userMapper.getUser(id);
    }
}
