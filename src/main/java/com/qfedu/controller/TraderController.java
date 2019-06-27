package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.pojo.Goods;
import com.qfedu.pojo.Orders;
import com.qfedu.service.CatService;
import com.qfedu.utils.GetCode;
import com.qfedu.vo.VoCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/26.
 */
@RestController
public class TraderController {
           @Autowired(required = false)
           private CatService catService;

    //添加购物车
    @RequestMapping("/addCat.do")
     public JsonBean addCat(VoCat voCat){
        catService.addCat(voCat);
        return new JsonBean(0,"商品已添加到购物车");
    }
   // 展示购物车
    @RequestMapping("/showCat.do")
    public JsonBean showCat(Integer uid){
        List<Goods> goodsList =catService.showCat(uid);
        System.out.println(goodsList+"11111111111111111111111111111");
        return new JsonBean(0,goodsList);
    }
    //改变商品数量
    @RequestMapping("/changeNum.do")
    public JsonBean changeNum(VoCat voCat){
        catService.changeNum(voCat);
        Integer cnum = catService.getCnum(voCat);
        return new JsonBean(0,cnum);
    }

    //提交订单
    @RequestMapping("/paymentOne.do")
    public JsonBean paymentOne(Orders orders, Integer pid, Double countMoney, Integer aid, Integer uid){
        String code = GetCode.getCode();
         orders.setOrdercode(code);
         orders.setOprice(countMoney);

        return null;
    }





 }
