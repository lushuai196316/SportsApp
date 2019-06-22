package com.qfedu.service.impl;

import com.qfedu.dao.SportCourseDao;
import com.qfedu.pojo.SportCourse;
import com.qfedu.service.SportCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/21.
 */
@Service
public class SportCourseServiceImpl implements SportCourseService {
       @Autowired(required = false)
       private SportCourseDao sportCourseDao;


       @Override
       public List<SportCourse> selectCourseById(Integer id) {
              System.out.println("aaaaaaaaaaaaaaaaa");
              return sportCourseDao.selectCourseById(id);
       }
}
