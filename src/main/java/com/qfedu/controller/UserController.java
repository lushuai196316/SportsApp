package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 鲁帅 on 2019/6/19.
 */
@Controller
public class UserController {
   //http://localhost:8080/sportsapp/validateData.do
    /* @RequestMapping("/validateData.do")
    public JsonBean  ValidateData(){
         // 第一个参数：图片宽，第二个：高，第三个参数，验证码的位数，第四个参数：干扰线的个数
       *//*  ValidateCode vc = new ValidateCode(100, 40, 4, 20);*//*
    }*/

    @RequestMapping("/register.do")
    public JsonBean login(String username, String password){
          return null;
    }
    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    @ResponseBody
    public JsonBean login (String username, String password, HttpServletRequest request){
        User user = userService.checkUser(username,password);
        String msg =null;
        if(user!=null){
            msg=user.getPassword()+user.getPassword();
            String token = Base64.encode(msg.getBytes());
            // 将token放到ServletContext中
            request.getServletContext().setAttribute(token, msg);
            Map<String,Object> map  = new HashMap();
            map.put("token",token);
            map.put("user",user);
            return new JsonBean(0,map);
        }else {
            return new JsonBean(1,"登陆失败");
        }
    }

}
