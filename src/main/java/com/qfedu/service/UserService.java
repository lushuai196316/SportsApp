package com.qfedu.service;

import com.qfedu.pojo.SportLable;
import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/20.
 */
public interface UserService {
    User checkUser(String username, String password);

    void addUser(String username, String password);

    void modifierUser(User user1);

    void insertLables(Integer id, Integer[] lids);


    List<SportLable> showLable();

}