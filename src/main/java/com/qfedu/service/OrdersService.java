package com.qfedu.service;

import com.qfedu.pojo.Goods;
import com.qfedu.pojo.Orders;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/27.
 */
public interface OrdersService {
    void paymentOne(Orders orders);


    List<Goods> showOrders(Integer uid);

    void deleteOrders(Orders orders);

    void paymentByCat(List<Orders> ordersList);

    void pay(Integer uid, Integer aid, Double money);
}