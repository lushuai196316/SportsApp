package com.qfedu.pojo;

import java.util.List;

/**
 * Created by 鲁帅 on 2019/6/21.
 */
public class SportCourse {
    private Integer id;
    private  String cname;
    private  Integer trainNum;
    private  Integer picId;
    private Picture picture;
    private List<Courseinfo> courseinfoList;

    public SportCourse(Integer id, String cname, Integer trainNum, Integer picId, Picture picture, List<Courseinfo> courseinfoList) {
        this.id = id;
        this.cname = cname;
        this.trainNum = trainNum;
        this.picId = picId;
        this.picture = picture;
        this.courseinfoList = courseinfoList;
    }

    public SportCourse() {
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
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
                ", picId=" + picId +
                ", picture=" + picture +
                ", courseinfoList=" + courseinfoList +
                '}';
    }

}
