package com.qfedu.dao;

import com.qfedu.pojo.Goods;
import com.qfedu.pojo.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/6/24 0024.
 */
public interface OrdersDao {
    void paymentOne(Orders orders);

    List<Goods> showOrders(Integer uid);


    void deleteOrders(Orders orders);

    void paymentByCat(@Param("ordersList") List<Orders> ordersList);
}
