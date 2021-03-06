package com.qfedu.vo;

import java.util.List;

//view object /value object
public class VPageInfo<T> {
    // 当前页
    private int currentPage;
    // 总页数
    private int totalPage;
    // 当前页查询的数据
    private List<T> pageList;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }
}
