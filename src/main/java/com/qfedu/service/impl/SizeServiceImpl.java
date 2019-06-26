package com.qfedu.service.impl;

import com.qfedu.dao.SizeDao;
import com.qfedu.pojo.Size;
import com.qfedu.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/25 0025.
 */
@Service
public class SizeServiceImpl implements SizeService {

    @Autowired(required = false)
    private SizeDao sizeDao;
    @Override
    public List<Size> sizeAll() {
        List<Size> list=sizeDao.sizeAll();
        return list;
    }
}
