package com.qfedu.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qfedu.common.JsonBean;
import com.qfedu.pojo.Goods;
import com.qfedu.pojo.Orders;
import com.qfedu.pojo.User;
import com.qfedu.service.CatService;
import com.qfedu.service.OrdersService;
import com.qfedu.service.UserService;
import com.qfedu.utils.GetCode;
import com.qfedu.vo.VoCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/26.
 */
@RestController
public class TraderController {

    @Autowired(required = false)
    private CatService catService;

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private UserService userService;


    //添加购物车
    @RequestMapping("/addCat.do")
    public JsonBean addCat(VoCat voCat) {
        catService.addCat(voCat);
        return new JsonBean(0, "商品已添加到购物车");
    }

    // 展示购物车
    @RequestMapping("/showCat.do")
    public JsonBean showCat(Integer uid) {
        List<Goods> goodsList = catService.showCat(uid);
        System.out.println(goodsList + "11111111111111111111111111111");
        return new JsonBean(0, goodsList);
    }

    //删除购物车
    @RequestMapping("/deleteCat.do")
    public  JsonBean deleteCat(Integer[] cid){
        catService.delCatById(cid);
        return  new JsonBean(0,"删除成功");
    }

    //改变商品数量
    @RequestMapping("/changeNum.do")
    public JsonBean changeNum(VoCat voCat) {
        catService.changeNum(voCat);
        Integer cnum = catService.getCnum(voCat);
        return new JsonBean(0, cnum);
    }

    //单个商品提交订单
    @RequestMapping("/paymentOne.do") //总钱数oprice,地址 fid,商品gid,用户uid,尺码sid
    public JsonBean paymentOne(Orders orders) {
        String code = GetCode.getCode();
        orders.setOrdercode(code);
        orders.setStatus(0);
        ordersService.paymentOne(orders);
        return new JsonBean(0, "下单成功");
    }

    //从购物车处提交订单  总钱数oprice,地址 fid,商品gid,用户uid,尺码sid   购物车cid
    @RequestMapping("/paymentByCat.do")
    public JsonBean paymentByCat(String  jsonOrders ,Integer[] cids){

        ObjectMapper objectMapper = new ObjectMapper();
        List<Orders> ordersList = null ;
        try {
            ordersList = objectMapper.readValue(jsonOrders, new TypeReference<List<Orders>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        catService.delCatById(cids);
         for(int i=0;i<ordersList.size();i++){
             String code = GetCode.getCode();
             ordersList.get(i).setOrdercode(code);
             ordersList.get(i).setStatus(0);
         }

        //ordersService.paymentByCat(ordersList);
        return new JsonBean(0, "下单成功");
    }
    //从购物车处提交订单  总钱数oprice,地址 fid,商品gid,用户uid,尺码sid   购物车cid
    @RequestMapping("/paymentByCat.do")
    public JsonBean paymentByCat(Double[] oprice,Integer[] fid,Integer[] gid,Integer[] uid,Integer[] sid,Integer[] cid){
        catService.delCatById(cid);
        List<Orders> ordersList =new ArrayList<Orders>();
        for (int i=0;i<oprice.length;i++){
            Orders orders = new Orders();
            String code = GetCode.getCode();
            orders.setOrdercode(code);
            orders.setStatus(0);
            orders.setOprice(oprice[i]);
            orders.setFid(fid[i]);
            orders.setGid(gid[i]);
            orders.setUid(uid[i]);
            orders.setSid(sid[i]);
            ordersList.add(orders);
        }
        ordersService.paymentByCat(ordersList);
        return new JsonBean(0, "下单成功");
    }

    //展示订单信息
    @RequestMapping("/showOrders.do")
    public JsonBean showOrders(Integer uid) {
        List<Goods> goodsList = ordersService.showOrders(uid);
        return new JsonBean(0,goodsList);
    }
    //删除订单    //用户uid 订单oid
    @RequestMapping("/deleteOrders.do")
    public JsonBean deleteOrders(Orders orders){
        ordersService.deleteOrders(orders);
        return new JsonBean(0,"订单已删除");
    }

    @RequestMapping("/pay.do") // 支付宝或者微信aid,密码password ,用户名username,用户uid 转账金额 accMoney
    public JsonBean pay (User user, Double money,Integer aid){
        User user1 = userService.checkUser(user.getUsername(), user.getPassword());
        if(user1!=null){
            try {
                if(user.getBalance()>=money){
                    ordersService.pay(user.getUid(),aid,money);
                    return new JsonBean(0,"转账成功");
                }else {
                    return  new JsonBean(3,"余额不足");
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
                return new JsonBean(2,"转账发生异常，转账失败");
            }

        }else {
            return new JsonBean(1,"密码输入有误");
        }
    }

}
