package com.example.forum.domain;

import java.time.LocalDate;

public class UserDetail {
    private Integer userId;
    private String userPhone;
    private Sex userSex;
    private Integer userAge;
    private LocalDate userBirthday;
    private String userAddress;
    private Integer userLoginCount;
    private Integer userPostCount;
    private UserLogin userLogin;

    public UserDetail() {
    }

    public UserDetail(String userPhone, Sex userSex, Integer userAge, LocalDate userBirthday, String userAddress, Integer userLoginCount, Integer userPostCount, UserLogin userLogin) {
        this.userPhone = userPhone;
        this.userSex = userSex;
        this.userAge = userAge;
        this.userBirthday = userBirthday;
        this.userAddress = userAddress;
        this.userLoginCount = userLoginCount;
        this.userPostCount = userPostCount;
        this.userLogin = userLogin;
    }

    public UserDetail(Integer userId, String userPhone, Sex userSex, Integer userAge, LocalDate userBirthday, String userAddress, Integer userLoginCount, Integer userPostCount) {
        this.userId = userId;
        this.userPhone = userPhone;
        this.userSex = userSex;
        this.userAge = userAge;
        this.userBirthday = userBirthday;
        this.userAddress = userAddress;
        this.userLoginCount = userLoginCount;
        this.userPostCount = userPostCount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Sex getUserSex() {
        return userSex;
    }

    public void setUserSex(Sex userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public LocalDate getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(LocalDate userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserLoginCount() {
        return userLoginCount;
    }

    public void setUserLoginCount(Integer userLoginCount) {
        this.userLoginCount = userLoginCount;
    }

    public Integer getUserPostCount() {
        return userPostCount;
    }

    public void setUserPostCount(Integer userPostCount) {
        this.userPostCount = userPostCount;
    }
    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", userPhone='" + userPhone + '\'' +
                ", userSex=" + userSex +
                ", userAge=" + userAge +
                ", userBirthday=" + userBirthday +
                ", userAddress='" + userAddress + '\'' +
                ", userLoginCount=" + userLoginCount +
                ", userPostCount=" + userPostCount +
                ", userLogin=" + userLogin +
                '}';
    }
}
