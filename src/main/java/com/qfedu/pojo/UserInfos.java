package com.qfedu.pojo;

/**
 * Created by 鲁帅 on 2019/6/25.
 */
public class UserInfos {
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
    //是否为默认地址 0:默认地址  1：不是默认地址
    private Integer flag;
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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "UserInfos{" +
                "fid=" + fid +
                ", consignee='" + consignee + '\'' +
                ", cphone='" + cphone + '\'' +
                ", region='" + region + '\'' +
                ", address='" + address + '\'' +
                ", flag=" + flag +
                ", uid=" + uid +
                '}';
    }
}
