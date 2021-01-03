package com.example.forum.domain;

public class UserOrganize {
    private Integer userGroupId;
    private Integer userId;
    private Integer organizeId;
    private UserLogin userLogin;
    private Organize organize;

    public UserOrganize() {
    }

    public UserOrganize(Integer userGroupId, Integer userId, Integer organizeId) {
        this.userGroupId = userGroupId;
        this.userId = userId;
        this.organizeId = organizeId;
    }

    public UserOrganize(Integer userGroupId, UserLogin userLogin, Organize organize) {
        this.userGroupId = userGroupId;
        this.userLogin = userLogin;
        this.organize = organize;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrganizeId() {
        return organizeId;
    }

    public void setOrganizeId(Integer organizeId) {
        this.organizeId = organizeId;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public Organize getOrganize() {
        return organize;
    }

    public void setOrganize(Organize organize) {
        this.organize = organize;
    }

    @Override
    public String toString() {
        return "UserOrganize{" +
                "userGroupId=" + userGroupId +
                ", userId=" + userId +
                ", organizeId=" + organizeId +
                ", userLogin=" + userLogin +
                ", organize=" + organize +
                '}';
    }
}
