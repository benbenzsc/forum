package com.example.forum.domain;

public class User {
    private Integer userId;
    private String user_name;
    private String userEmail;
    private String userPassword;
    private String userCookie;

    public User() {
    }

    public User(Integer userId, String user_name, String userEmail, String userPassword, String userCookie) {
        this.userId = userId;
        this.user_name = user_name;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userCookie = userCookie;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserCookie() {
        return userCookie;
    }

    public void setUserCookie(String userCookie) {
        this.userCookie = userCookie;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", user_name='" + user_name + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userCookie='" + userCookie + '\'' +
                '}';
    }
}
