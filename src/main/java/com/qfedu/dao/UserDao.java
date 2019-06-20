package com.qfedu.dao;

import com.qfedu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/19.
 */
public interface UserDao {
    public List<String> findRolesByName(String name);

    public List<String> findPermsByName(String name);

    public User findByName(String name) ;

    public User checkUser(@Param("username") String username, @Param("password") String password) ;

    void addUser(String username, String password);
}
