package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/24 0024.
 */
public class Size {

    //尺码Id
    private  Integer sid;
    //尺码
    private  String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


    @Override
    public String toString() {
        return "Size{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}
