package com.qfedu.service;

import com.qfedu.pojo.SportCourse;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/21.
 */
public interface SportCourseService {

    List<SportCourse> selectCourseById(Integer id);
}
