package com.qfedu.service.impl;

import com.qfedu.dao.UserInfosDao;
import com.qfedu.pojo.UserInfos;
import com.qfedu.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/25 0025.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired(required = false)
    private UserInfosDao userInfosDao;

    //添加地址
    @Override
    public void addAddress(UserInfos userInfos) {
        userInfosDao.addAddress(userInfos);
    }
    //删除地址
    @Override
    public void deleteAddress(Integer fid) {

        userInfosDao.deleteAddress(fid);
    }

    //要修改的地址
    @Override
    public UserInfos selectAddressById(Integer fid) {

        UserInfos userInfos=userInfosDao.selectAddressById(fid);

        return userInfos;
    }

    //修改地址
    @Override
    public void editAddress(UserInfos userInfos) {

        userInfosDao.editAddress(userInfos);
    }

    @Override
    public void editAddressFlag() {
        userInfosDao.editAddressFlag();
    }

    //查询所有的收货地址
    @Override
    public List<UserInfos> findaddressAll() {
        List<UserInfos> userInfosList =  userInfosDao.findaddressAll();
        return userInfosList;
    }
}
