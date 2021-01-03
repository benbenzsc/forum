package com.example.forum.domain;

public class UserJurisdiction {
    private Integer userJurisdictionId;
    private Integer userId;
    private Integer jurisdictionId;
    private UserLogin userLogin;
    private Jurisdiction jurisdiction;

    public UserJurisdiction() {
    }

    public UserJurisdiction(Integer userJurisdictionId, Integer userId, Integer jurisdictionId) {
        this.userJurisdictionId = userJurisdictionId;
        this.userId = userId;
        this.jurisdictionId = jurisdictionId;
    }

    public UserJurisdiction(Integer userJurisdictionId, UserLogin userLogin, Jurisdiction jurisdiction) {
        this.userJurisdictionId = userJurisdictionId;
        this.userLogin = userLogin;
        this.jurisdiction = jurisdiction;
    }

    public Integer getUserJurisdictionId() {
        return userJurisdictionId;
    }

    public void setUserJurisdictionId(Integer userJurisdictionId) {
        this.userJurisdictionId = userJurisdictionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public Jurisdiction getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Jurisdiction jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public String toString() {
        return "UserJurisdiction{" +
                "userJurisdictionId=" + userJurisdictionId +
                ", userId=" + userId +
                ", jurisdictionId=" + jurisdictionId +
                ", userLogin=" + userLogin +
                ", jurisdiction=" + jurisdiction +
                '}';
    }
}
