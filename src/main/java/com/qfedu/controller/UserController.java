package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.pojo.SportCourse;
import com.qfedu.pojo.SportLable;
import com.qfedu.pojo.User;
import com.qfedu.service.SportCourseService;
import com.qfedu.service.UserService;
import com.qfedu.utils.UploadUtils;
import com.qfedu.utils.suij;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 鲁帅 on 2019/6/19.
 */
@Controller
public class UserController {
    @Autowired(required = false)
    private UserService userService;
    @Autowired(required = false)
    private UploadUtils uploadUtils;
    @Autowired(required = false)
    private SportCourseService sportCourseService;

    @RequestMapping("/register.do")
    @ResponseBody
    public JsonBean login(String username, String password) {
        // 验证用户名是否存在
        User user = userService.checkUser(username, null);
        if (user == null) {
            //不存在
            userService.addUser(username, password);
            return new JsonBean(0, "注册成功");
        } else {
            return new JsonBean(1, "用户名已存在");
        }

    }

    @RequestMapping("/login.do")
    @ResponseBody
    public JsonBean login(String username, String password, HttpServletRequest request) {
        User user = userService.checkUser(username, password);
        String msg = null;
        if (user != null) {
            msg = user.getPassword() + user.getPassword();
            String token = Base64.encode(msg.getBytes());
            // 将token放到ServletContext中
            request.getServletContext().setAttribute(token, msg);
            Map<String, Object> map = new HashMap();
            map.put("token", token);
            map.put("user", user);
            return new JsonBean(0, map);
        } else {
            return new JsonBean(1, "登陆失败");
        }
    }

    static String verCode = null;
    //获得验证码
    @RequestMapping("/getVerCode.do")
    @ResponseBody
    public String getVerCode() {
        verCode = suij.getVerCode();
        return verCode;
    }
    //修改密码
    @RequestMapping("/modifierPassword.do")
    @ResponseBody
    public JsonBean modifierPassword(String verCode1, User user1) {
        if (verCode.equals(verCode1)) {
            User user = userService.checkUser(user1.getUsername(), null);
            if (user != null) {
                //存在
                userService.modifierUser(user1);
                return new JsonBean(0, "修改成功");
            } else {
                return new JsonBean(1, "用户名不存在");
            }
        } else {
            return new JsonBean(2, "验证码输入有误");
        }
    }
    //添加用户别的信息
    @RequestMapping("/modifierUser.do")
    @ResponseBody
    public JsonBean modifierUser(User user, @RequestParam("file") MultipartFile file) {
        Integer picId = null;
        if (file != null && !file.getOriginalFilename().equals("")) {
            picId = uploadUtils.savePic(file);
        }
        if (picId != null) {
            user.setPicId(picId);
        }
        userService.modifierUser(user);
        return new JsonBean(0, "添加成功");
    }
     //展示运动标签
    @RequestMapping("/showLable.do")
    @ResponseBody
    public JsonBean showLable() {
        List<SportLable> sportLableList = userService.showLable();
        return new JsonBean(0, sportLableList);
    }
    //选择运动标签，并且根据用户id,选择合适的课程
    @RequestMapping("/chooseLable.do")
    @ResponseBody
    public JsonBean chooseLable(Integer id, Integer[] lids) {
        userService.insertLables(id, lids);
        List<SportCourse> sportCourseList = sportCourseService.selectCourseById(id);
        System.out.println(sportCourseList);
        return new JsonBean(0,sportCourseList);
    }


}
