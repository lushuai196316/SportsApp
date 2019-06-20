package com.qfedu.service.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 鲁帅 on 2019/6/20.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserDao userDao;
    @Override
    public User checkUser(String username, String password) {

        return userDao.checkUser(username,password);
    }
}
