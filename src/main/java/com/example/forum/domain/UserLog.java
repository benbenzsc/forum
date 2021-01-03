package com.example.forum.domain;

import java.time.LocalDateTime;

public class UserLog {
    private Integer logId;
    private String userId;
    private LocalDateTime userLoginTime;

    public UserLog() {
    }

    public UserLog(Integer logId, String userId, LocalDateTime userLoginTime) {
        this.logId = logId;
        this.userId = userId;
        this.userLoginTime = userLoginTime;
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(LocalDateTime userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    @Override
    public String toString() {
        return "UserLog{" +
                "logId=" + logId +
                ", userId='" + userId + '\'' +
                ", userLoginTime=" + userLoginTime +
                '}';
    }
}
