package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.pojo.Size;
import com.qfedu.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2019/6/25 0025.
 */
@Controller
public class SizeController {

    @Autowired(required = false)
    private SizeService sizeService;


    //所有的尺码
    @RequestMapping("/sizeall.do")
    @ResponseBody
    public JsonBean sizeAll(){
        List<Size> sizeList = sizeService.sizeAll();
        System.out.println("所有的尺码："+sizeList);
        return new JsonBean(0,sizeList);
    }

}
