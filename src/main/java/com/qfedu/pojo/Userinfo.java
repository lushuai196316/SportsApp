package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/24 0024.
 */
public class UserInfo {

    //收货人ID
    private Integer fid;
    //收货人姓名
    private String consignee;
    //收货人电话
    private String cphone;
    //收货人省市区
    private  String region;
    //收货人详细地址
    private  String address;
    //用户Id
    private  Integer uid;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "fid=" + fid +
                ", consignee='" + consignee + '\'' +
                ", cphone='" + cphone + '\'' +
                ", region='" + region + '\'' +
                ", address='" + address + '\'' +
                ", uid=" + uid +
                '}';
    }
}
