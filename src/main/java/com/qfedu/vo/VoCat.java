package com.qfedu.vo;

import com.qfedu.pojo.Cat;

/**
 * Created by 鲁帅 on 2019/6/26.
 */
public class VoCat extends Cat {
    private Integer gid;
    private Integer sid;
    private Integer uid;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    @Override
    public String toString() {
        return "VoCat{" +
                "gid=" + gid +
                ", sid=" + sid +
                ", uid=" + uid +
                '}';
    }
}
