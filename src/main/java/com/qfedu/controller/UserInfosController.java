package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.pojo.UserInfos;
import com.qfedu.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserInfosController {

    @Autowired(required = false)
    private UserInfoService userInfoService;

    //查询收货地址
    @RequestMapping("/findaddressAll.do")
    @ResponseBody
    public JsonBean findaddressAll(){

      List<UserInfos> userInfosList= userInfoService.findaddressAll();
        System.out.println("查询所有的收货地址："+userInfosList);
        return new JsonBean(0,"userInfosList");
    }

    //添加新地址
    @RequestMapping("/addaddress.do")
    @ResponseBody
    public JsonBean addAddress(UserInfos userInfos){

        System.out.println("添加的地址："+userInfos);
        userInfoService.addAddress(userInfos);
        return new JsonBean(0,"添加成功");
    }

    //删除地址
    @RequestMapping("/deleteaddress.do")
    @ResponseBody
    public JsonBean deleteAddress(Integer fid){

        System.out.println("删除的地址id："+fid);
        userInfoService.deleteAddress(fid);
        return new JsonBean(0,"删除成功");
    }


    //查找要修改的信息
    @RequestMapping("/selectaddress.do")
    @ResponseBody
    public JsonBean selectAddressById(Integer fid){
        System.out.println("要修改的地址id："+fid);
        UserInfos userInfos= userInfoService.selectAddressById(fid);
        return new JsonBean(0,userInfos);
    }


    //修改地址
    @RequestMapping("/editaddress.do")
    @ResponseBody
    public JsonBean editAddress(UserInfos userInfos){
        System.out.println("修改地址信息："+userInfos);
        if(userInfos.getFlag()!=0){
            userInfoService.editAddress(userInfos);
            return new JsonBean(0,"修改成功");
        }else {
            userInfoService.editAddressFlag();
            userInfoService.editAddress(userInfos);
            return new JsonBean(0,"修改成功");
        }
    }

}
