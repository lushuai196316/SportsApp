package com.qfedu.pojo;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Integer picId;
    private String sex;
    private Integer height;
    private Double weight;
    private Double balance;


    public User() {
    }

    public User(Integer id, String username, String password, String nickname, Integer picId, String sex, Integer height, Double weight, Double balance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.picId = picId;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", picId=" + picId +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", balance=" + balance +
                '}';
    }
}
