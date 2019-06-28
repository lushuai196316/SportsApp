package com.qfedu.pojo;

import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ordertime;
    //用户Id
    private Integer uid;
    //用户I状态
    private Integer status;
    private Double oprice;
    private Integer fid;
    private Integer sid;
    private Integer gid;
    private Integer onum;
    private Goods goods;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getOnum() {
        return onum;
    }

    public void setOnum(Integer onum) {
        this.onum = onum;
    }

    public Double getOprice() {
        return oprice;
    }

    public void setOprice(Double oprice) {
        this.oprice = oprice;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

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
                ", oprice=" + oprice +
                ", fid=" + fid +
                ", sid=" + sid +
                ", gid=" + gid +
                ", onum=" + onum +
                ", goods=" + goods +
                '}';
    }
}
