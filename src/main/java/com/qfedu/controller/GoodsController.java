package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.pojo.Goods;
import com.qfedu.pojo.Picture;
import com.qfedu.service.GoodsService;
import com.qfedu.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2019/6/24 0024.
 */
@Controller
public class GoodsController {

    @Autowired(required = false)
    private GoodsService goodsService;

    @Autowired(required = false)
    private PictureService pictureService;

    //类别下的所有商品
    @RequestMapping("/typetogoods.do")
    @ResponseBody
    public JsonBean typeToGoods(Integer tid) {
        List<Goods> goodsList = goodsService.typeToGoods(tid);
        System.out.println("根据类别找所有的商品："+goodsList);
        return new JsonBean(0, goodsList);
    }



    //商城图片轮播
    @RequestMapping("/showPicture.do")
    @ResponseBody
    public JsonBean showPicture(){
        List<Picture> pictureList = pictureService.showPicture();
        return new JsonBean(0,pictureList);
    }

    //热门推荐
    @RequestMapping("/hot.do")
    @ResponseBody
    public JsonBean hot(){
        List<Goods> pictureList = goodsService.showGoodSAll();
        return new JsonBean(0,pictureList);
    }

    //根据图片选出对应的商品
    @RequestMapping("/picturetogoods.do")
    @ResponseBody
    public JsonBean pictureToGood(Integer pid) {
        Goods good = goodsService.pictureToGoods(pid);
        System.out.println("图片选商品："+good);
        return new JsonBean(0, good);
    }



}
