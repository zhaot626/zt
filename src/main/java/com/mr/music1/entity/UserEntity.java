package com.mr.music1.entity;

import lombok.Data;

@Data
public class UserEntity {

    private Integer userId;

    private String userName;

    private String userPassword;

    public Integer getuserId() {
        return userId;
    }

    public void setuserId(Integer userId) {
        this.userId = userId;
    }


    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String  getuserPassword() {
        return userPassword;
    }

    public void setuserPassword(String  userPassword) {
        this.userPassword = userPassword;
    }
}