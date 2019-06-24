package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/24 0024.
 */
public class Account {
    private Integer aid;
    private String aname;
    private  String card;
    private  String apassword;
    private Double balance;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", card='" + card + '\'' +
                ", apassword='" + apassword + '\'' +
                ", balance=" + balance +
                '}';
    }
}
