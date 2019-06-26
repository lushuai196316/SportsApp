package com.qfedu.pojo;

/**
 * Created by 鲁帅 on 2019/6/26.
 */
public class Cat {

    private Integer cid;
    private Integer cnum;

    public Cat(Integer cid, Integer cnum) {
        this.cid = cid;
        this.cnum = cnum;
    }

    public Cat() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCnum() {
        return cnum;
    }

    public void setCnum(Integer cnum) {
        this.cnum = cnum;
    }
}
