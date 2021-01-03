package com.example.forum.domain;

public class OrganizeJurisdiction {
    private Integer groupJurisdictionId;
    private Integer organizeId;
    private Integer jurisdictionId;
    private Organize organize;
    private Jurisdiction jurisdiction;

    public OrganizeJurisdiction() {
    }

    public OrganizeJurisdiction(Integer groupJurisdictionId, Integer organizeId, Integer jurisdictionId) {
        this.groupJurisdictionId = groupJurisdictionId;
        this.organizeId = organizeId;
        this.jurisdictionId = jurisdictionId;
    }

    public OrganizeJurisdiction(Integer groupJurisdictionId, Organize organize, Jurisdiction jurisdiction) {
        this.groupJurisdictionId = groupJurisdictionId;
        this.organize = organize;
        this.jurisdiction = jurisdiction;
    }

    public Integer getGroupJurisdictionId() {
        return groupJurisdictionId;
    }

    public void setGroupJurisdictionId(Integer groupJurisdictionId) {
        this.groupJurisdictionId = groupJurisdictionId;
    }

    public Integer getOrganizeId() {
        return organizeId;
    }

    public void setOrganizeId(Integer organizeId) {
        this.organizeId = organizeId;
    }

    public Integer getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public Organize getOrganize() {
        return organize;
    }

    public void setOrganize(Organize organize) {
        this.organize = organize;
    }

    public Jurisdiction getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Jurisdiction jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public String toString() {
        return "OrganizeJurisdiction{" +
                "groupJurisdictionId=" + groupJurisdictionId +
                ", organizeId=" + organizeId +
                ", jurisdictionId=" + jurisdictionId +
                ", organize=" + organize +
                ", jurisdiction=" + jurisdiction +
                '}';
    }
}
