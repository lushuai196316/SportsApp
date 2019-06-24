package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/24 0024.
 */
public class GoodsType {

    //类别Id
    private  Integer tid;
    //类别名字
    private  String tname;

    @Override
    public String toString() {
        return "GoodsType{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
