package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/24 0024.
 */
public class GoodsType {

    //类别Id
    private  Integer tid;
    //类别名字
    private  String tname;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
