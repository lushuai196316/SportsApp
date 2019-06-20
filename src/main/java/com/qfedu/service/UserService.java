package com.qfedu.service;

import com.qfedu.pojo.User;

/**
 * Created by 鲁帅 on 2019/6/20.
 */
public interface UserService {
    User checkUser(String username, String password);
}