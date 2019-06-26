package com.qfedu.dao;

import com.qfedu.vo.VoCat;

/**
 * Created by 鲁帅 on 2019/6/26.
 */
public interface CatDao {
    void addCat(VoCat voCat);

    void changeCnum(VoCat voCat);

    Integer getCnum(VoCat voCat);
}
