package com.qfedu.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2019/6/24 0024.
 */
public interface AccountDao {


    void receiptMoney(@Param("aid") Integer aid,@Param("money") Double money);
}
