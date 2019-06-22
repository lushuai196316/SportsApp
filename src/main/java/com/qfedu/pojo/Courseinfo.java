package com.qfedu.pojo;

/**
 * Created by 鲁帅 on 2019/6/21.
 */
public class Courseinfo {
    private Integer iid;
    private String iname;
    private Integer  actionNum;
    private Integer cycleNum;
    private Integer trainTime;

    public Courseinfo() {
    }

    public Courseinfo(Integer iid, String iname, Integer actionNum, Integer cycleNum, Integer trainTime) {
        this.iid = iid;
        this.iname = iname;
        this.actionNum = actionNum;
        this.cycleNum = cycleNum;
        this.trainTime = trainTime;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public Integer getActionNum() {
        return actionNum;
    }

    public void setActionNum(Integer actionNum) {
        this.actionNum = actionNum;
    }

    public Integer getCycleNum() {
        return cycleNum;
    }

    public void setCycleNum(Integer cycleNum) {
        this.cycleNum = cycleNum;
    }

    public Integer getTrainTime() {
        return trainTime;
    }

    public void setTrainTime(Integer trainTime) {
        this.trainTime = trainTime;
    }

    @Override
    public String toString() {
        return "Courseinfo{" +
                "iid=" + iid +
                ", iname='" + iname + '\'' +
                ", actionNum=" + actionNum +
                ", cycleNum=" + cycleNum +
                ", trainTime=" + trainTime +
                '}';
    }
}
