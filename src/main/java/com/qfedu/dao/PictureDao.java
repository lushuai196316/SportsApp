package com.qfedu.dao;

import com.qfedu.pojo.Picture;

/**
 * Created by 鲁帅 on 2019/6/21.
 */
public interface PictureDao {
    void insertSelective(Picture picture);
}