package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/24 0024.
 */
public class Goods {

    //商品ID
    private Integer gid;
    //商品名字
    private String gname;
    //商品详情
    private String detail;
    //商品价格
    private  Double price;
    //快递方式
    private String express;
    //销量
    private Integer saleNum;
    //品牌
    private String brand;
    //材质面料
    private String material;
    //类别id
    private Integer tid;
    //图片id
    private  Integer pid;
    //嵌套类别
    private  GoodsType goodsType;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", express='" + express + '\'' +
                ", saleNum=" + saleNum +
                ", brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                ", tid=" + tid +
                ", pid=" + pid +
                ", goodsType=" + goodsType +
                '}';
    }
}
