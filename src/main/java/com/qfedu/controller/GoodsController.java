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

    //运动服饰下的所有商品
    @RequestMapping("/sportswear.do")
    @ResponseBody
    public JsonBean sportswearAll(Integer tid) {
        List<Goods> goodsList = goodsService.sportswearAll(tid);
        System.out.println("所有商品："+goodsList);
        return new JsonBean(0, goodsList);
    }

    //运动装备下的所有商品
    @RequestMapping("/equipment.do")
    @ResponseBody
    public JsonBean equipment( Integer tid) {
        List<Goods> goodsList = goodsService.sportswearAll(tid);
        return new JsonBean(0, goodsList);
    }


    //健康食品下的所有商品
    @RequestMapping("/healthy.do")
    @ResponseBody
    public JsonBean healthy(Integer tid) {
        List<Goods> goodsList = goodsService.sportswearAll(tid);
        return new JsonBean(0, goodsList);
    }



    //商城图片轮播
    @RequestMapping("/showPicture.do")
    @ResponseBody
    public JsonBean showPicture(){
        List<Picture> pictureList = pictureService.showPicture();
        return new JsonBean(0,pictureList);
    }
}
