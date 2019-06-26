package com.qfedu.service;

import com.qfedu.pojo.UserInfos;

import java.util.List;

/**
 * Created by Administrator on 2019/6/25 0025.
 */
public interface UserInfoService {

    void addAddress(UserInfos userInfos);

    void deleteAddress(Integer fid);

    UserInfos selectAddressById(Integer fid);

    void editAddress(UserInfos userInfos);

    void editAddressFlag();

    List<UserInfos> findaddressAll();
}
