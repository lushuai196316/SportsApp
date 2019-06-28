package com.qfedu.service.impl;

import com.qfedu.dao.AccountDao;
import com.qfedu.dao.OrdersDao;
import com.qfedu.dao.UserDao;
import com.qfedu.pojo.Goods;
import com.qfedu.pojo.Orders;
import com.qfedu.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/27.
 */

@Service
public class OrderServiceImpl implements OrdersService {

    @Autowired(required = false)
    private OrdersDao ordersDao;

    @Autowired(required = false)
    private UserDao userDao;

    @Autowired(required = false)
    private AccountDao accountDao;

    @Override
    public void paymentOne(Orders orders) {
        ordersDao.paymentOne(orders);
    }

    @Override
    public List<Goods> showOrders(Integer uid) {

        return ordersDao.showOrders(uid);
    }

    @Override
    public void deleteOrders(Orders orders) {
        ordersDao.deleteOrders(orders);
    }

    @Override
    public void paymentByCat(List<Orders> ordersList) {
        ordersDao.paymentByCat(ordersList);
    }


    @Override
    @Transactional(readOnly =false ,isolation = Isolation.READ_COMMITTED)
    public void pay(Integer uid, Integer aid, Double money){
            userDao.pay(uid,money);
             int a=1/0;
            accountDao.receiptMoney(aid,money);
    }


}
