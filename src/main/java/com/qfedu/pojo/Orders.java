package com.qfedu.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2019/6/24 0024.
 */
public class Orders {

    //订单Id
    private Integer oid;
    //订单编号
    private String ordercode;
    //下单时间
    private Date ordertime;
    //用户Id
    private Integer uid;
    //用户I状态
    private Integer status;


    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", ordercode='" + ordercode + '\'' +
                ", ordertime=" + ordertime +
                ", uid=" + uid +
                ", status=" + status +
                '}';
    }
}
