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
    public List<Goods> typeToGoods(Integer tid) {
        List<Goods> goodsList=  goodsDao.typeToGoods(tid);
        return goodsList;
    }

    @Override
    public List<Goods> showGoodSAll() {
        List<Goods> goodsList= goodsDao.showGoodSAll();
        return goodsList;
    }

    //根据图片Id找出对应的商品
    @Override
    public Goods pictureToGoods(Integer pid) {
        Goods good = goodsDao.pictureToGoods(pid);
        return good;
    }
}
