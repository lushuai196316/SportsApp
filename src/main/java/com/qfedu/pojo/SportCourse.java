package com.qfedu.pojo;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/21.
 */
public class SportCourse {
    private Integer id;
    private  String cname;
    private  Integer trainNum;
    private List<Courseinfo> courseinfoList;

    public SportCourse(Integer id, String cname, Integer trainNum, List<Courseinfo> courseinfoList) {
        this.id = id;
        this.cname = cname;
        this.trainNum = trainNum;
        this.courseinfoList = courseinfoList;
    }

    public SportCourse() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(Integer trainNum) {
        this.trainNum = trainNum;
    }


    public List<Courseinfo> getCourseinfoList() {
        return courseinfoList;
    }

    public void setCourseinfoList(List<Courseinfo> courseinfoList) {
        this.courseinfoList = courseinfoList;
    }

    @Override
    public String toString() {
        return "SportCourse{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", trainNum=" + trainNum +
                ", courseinfoList=" + courseinfoList +
                '}';
    }
}
