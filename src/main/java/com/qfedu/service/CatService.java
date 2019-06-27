package com.qfedu.service;

import com.qfedu.pojo.Goods;
import com.qfedu.vo.VoCat;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/26.
 */
public interface CatService {
    void addCat(VoCat voCat);

    List<Goods> showCat(Integer uid);

    void changeNum(VoCat voCat);

    Integer getCnum(VoCat voCat);
}