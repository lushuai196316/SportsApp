package com.qfedu.dao;

import com.qfedu.vo.VoCat;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 鲁帅 on 2019/6/26.
 */
public interface CatDao {
    void addCat(VoCat voCat);

    void changeCnum(VoCat voCat);

    Integer getCnum(VoCat voCat);

    void delCatById(@Param("cids") Integer[] cids);
}
