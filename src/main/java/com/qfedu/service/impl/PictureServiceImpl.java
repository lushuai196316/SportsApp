package com.qfedu.service.impl;

import com.qfedu.dao.PictureDao;
import com.qfedu.pojo.Picture;
import com.qfedu.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/24 0024.
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Autowired(required = false)
    private PictureDao pictureDao;
    @Override
    public List<Picture> showPicture() {
        List<Picture> list = pictureDao.showPicture();
        return list;
    }





}
