package com.qfedu.service.impl;

import com.qfedu.dao.CatDao;
import com.qfedu.dao.GoodsDao;
import com.qfedu.pojo.Goods;
import com.qfedu.service.CatService;
import com.qfedu.vo.VoCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/26.
 */
@Service
public class CatServiceImpl implements CatService{

    @Autowired(required = false)
    private CatDao catDao;
    @Autowired(required = false)
    private GoodsDao goodsDao;

    @Override
    public void addCat(VoCat voCat) {
          catDao.addCat(voCat);
    }

    @Override
    public List<Goods> showCat(Integer uid) {
        return goodsDao.showCat(uid);
    }

    @Override
    public void changeNum(VoCat voCat) {
        catDao.changeCnum(voCat);
    }

    @Override
    public Integer getCnum(VoCat voCat) {
        return  catDao.getCnum(voCat);
    }

    @Override
    public void delCatById(Integer[] cids) {
        catDao.delCatById(cids);
    }
}
