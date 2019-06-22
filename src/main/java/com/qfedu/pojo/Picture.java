package com.qfedu.pojo;

/**
 * Created by 鲁帅 on 2019/6/21.
 */
public class Picture {

    private Integer id;

    private String path;

    private String status;

    public Picture(Integer id, String path, String status) {
        this.id = id;
        this.path = path;
        this.status = status;
    }

    public Picture() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
