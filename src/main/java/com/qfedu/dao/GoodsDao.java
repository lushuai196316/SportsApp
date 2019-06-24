package com.qfedu.dao;

import com.qfedu.pojo.Goods;

import java.util.List;

/**
 * Created by Administrator on 2019/6/24 0024.
 */
public interface GoodsDao {

    List<Goods> sportswearAll(Integer tid);
}
