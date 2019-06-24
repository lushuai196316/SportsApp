package com.qfedu.service.impl;

import com.qfedu.dao.GoodsDao;
import com.qfedu.pojo.Goods;
import com.qfedu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/24.
 */

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired(required = false)
    private GoodsDao goodsDao;


    @Override
    public List<Goods> sportswearAll(Integer tid) {
        List<Goods> goodsList=  goodsDao.sportswearAll(tid);
        return goodsList;
    }

}
