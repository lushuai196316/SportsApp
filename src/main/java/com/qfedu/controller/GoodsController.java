package com.qfedu.controller;

import com.qfedu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by 鲁帅 on 2019/6/24.
 */
@Controller
public class GoodsController {

    @Autowired(required = false)
    private GoodsService goodsService;

}
