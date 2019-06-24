package com.qfedu.controller;

import com.qfedu.common.JsonBean;
import com.qfedu.utils.UploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 鲁帅 on 2019/6/22.
 */
@Controller
public class PictureController {

    @Autowired(required = false)
    private UploadUtils uploadUtils;

    @RequestMapping("/uploadPicture.do")
    public JsonBean uploadPicture(@RequestParam("file") MultipartFile file) {
        Integer picId = null;
        if (file != null && !file.getOriginalFilename().equals("")) {
            picId = uploadUtils.savePic(file);
        }
        return new JsonBean(0, "添加成功");
    }
}
