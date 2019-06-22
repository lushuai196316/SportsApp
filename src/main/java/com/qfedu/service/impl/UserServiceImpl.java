package com.qfedu.service.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.pojo.SportLable;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public void addUser(String username, String password) {
        userDao.addUser(username,password);
    }

    @Override
    public void modifierUser(User user1) {
        userDao.modifierUser(user1);
    }

    @Override
    public void insertLables(Integer id, Integer[] lids) {
             userDao.insertLables(id,lids);
    }

    @Override
    public List<SportLable> showLable() {
        List<SportLable> sportLableList=   userDao.showLable();
        return sportLableList;
    }


}
