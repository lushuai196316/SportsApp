package com.qfedu.service;

import com.qfedu.pojo.Goods;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/24.
 */
public interface GoodsService {

    List<Goods> typeToGoods(Integer tid);

    List<Goods> showGoodSAll();

    Goods pictureToGoods(Integer pid);
}
