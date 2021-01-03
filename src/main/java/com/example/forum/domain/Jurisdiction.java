package com.example.forum.domain;

public class Jurisdiction {
    private Integer jurisdictionId;
    private String jurisdictionName;

    public Jurisdiction() {
    }

    public Jurisdiction(Integer jurisdictionId, String jurisdictionName) {
        this.jurisdictionId = jurisdictionId;
        this.jurisdictionName = jurisdictionName;
    }

    public Integer getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public String getJurisdictionName() {
        return jurisdictionName;
    }

    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    @Override
    public String toString() {
        return "Jurisdiction{" +
                "jurisdictionId=" + jurisdictionId +
                ", jurisdictionName='" + jurisdictionName + '\'' +
                '}';
    }
}
