package com.qfedu.dao;

import com.qfedu.pojo.SportCourse;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/21.
 */
public interface SportCourseDao {
    List<SportCourse> selectCourseById(Integer id);
}
