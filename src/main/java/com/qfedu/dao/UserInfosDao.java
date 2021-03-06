package com.qfedu.dao;

import com.qfedu.pojo.UserInfos;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/25.
 */
public interface UserInfosDao {

    void addAddress(UserInfos userInfos);

    void deleteAddress(Integer fid);

    UserInfos selectAddressById(Integer fid);

    void editAddress(UserInfos userInfos);

    void editAddressFlag();

    List<UserInfos> findaddressAll();
}