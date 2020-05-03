package com.example.demo.service.impl;

import com.example.demo.dao.BaseDao;
import com.example.demo.dao.master.UserDao;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户操作实现类
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    protected BaseDao<User> getMapper() {
        return this.userDao;
    }

}
