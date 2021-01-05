package com.example.forum.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDetail {
    private Integer userDetailId;
    private Integer userId;
    private String userPhone;
    private Sex userSex;
    private Integer userAge;
    private LocalDate userBirthday;
    private String userAddress;
    private Integer userLoginCount;
    private LocalDateTime userLastLoginTime;
    private Integer userPostCount;
    private Integer userReplyCount;
    private User user;

    public UserDetail() {
    }

    public UserDetail(Integer userDetailId, Integer userId, String userPhone, Sex userSex, Integer userAge, LocalDate userBirthday, String userAddress, Integer userLoginCount, LocalDateTime userLastLoginTime, Integer userPostCount, Integer userReplyCount) {
        this.userDetailId = userDetailId;
        this.userId = userId;
        this.userPhone = userPhone;
        this.userSex = userSex;
        this.userAge = userAge;
        this.userBirthday = userBirthday;
        this.userAddress = userAddress;
        this.userLoginCount = userLoginCount;
        this.userLastLoginTime = userLastLoginTime;
        this.userPostCount = userPostCount;
        this.userReplyCount = userReplyCount;
    }

    public UserDetail(Integer userDetailId, String userPhone, Sex userSex, Integer userAge, LocalDate userBirthday, String userAddress, Integer userLoginCount, LocalDateTime userLastLoginTime, Integer userPostCount, Integer userReplyCount, User user) {
        this.userDetailId = userDetailId;
        this.userPhone = userPhone;
        this.userSex = userSex;
        this.userAge = userAge;
        this.userBirthday = userBirthday;
        this.userAddress = userAddress;
        this.userLoginCount = userLoginCount;
        this.userLastLoginTime = userLastLoginTime;
        this.userPostCount = userPostCount;
        this.userReplyCount = userReplyCount;
        this.user = user;
    }

    public Integer getUserDetailId() {
        return userDetailId;
    }

    public void setUserDetailId(Integer userDetailId) {
        this.userDetailId = userDetailId;
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

    public LocalDateTime getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(LocalDateTime userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public Integer getUserPostCount() {
        return userPostCount;
    }

    public void setUserPostCount(Integer userPostCount) {
        this.userPostCount = userPostCount;
    }

    public Integer getUserReplyCount() {
        return userReplyCount;
    }

    public void setUserReplyCount(Integer userReplyCount) {
        this.userReplyCount = userReplyCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "userDetailId=" + userDetailId +
                ", userId=" + userId +
                ", userPhone='" + userPhone + '\'' +
                ", userSex=" + userSex +
                ", userAge=" + userAge +
                ", userBirthday=" + userBirthday +
                ", userAddress='" + userAddress + '\'' +
                ", userLoginCount=" + userLoginCount +
                ", userLastLoginTime=" + userLastLoginTime +
                ", userPostCount=" + userPostCount +
                ", userReplyCount=" + userReplyCount +
                ", user=" + user +
                '}';
    }
}
