package com.example.forum.domain;

public class JurisdictionRole {
    private Integer jurisdictionRole;
    private Integer jurisdictionId;
    private Integer roleId;
    private Jurisdiction jurisdiction;
    private Role role;

    public JurisdictionRole() {
    }

    public JurisdictionRole(Integer jurisdictionRole, Integer jurisdictionId, Integer roleId) {
        this.jurisdictionRole = jurisdictionRole;
        this.jurisdictionId = jurisdictionId;
        this.roleId = roleId;
    }

    public JurisdictionRole(Integer jurisdictionRole, Jurisdiction jurisdiction, Role role) {
        this.jurisdictionRole = jurisdictionRole;
        this.jurisdiction = jurisdiction;
        this.role = role;
    }

    public Integer getJurisdictionRole() {
        return jurisdictionRole;
    }

    public void setJurisdictionRole(Integer jurisdictionRole) {
        this.jurisdictionRole = jurisdictionRole;
    }

    public Integer getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Jurisdiction getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Jurisdiction jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "JurisdictionRole{" +
                "jurisdictionRole=" + jurisdictionRole +
                ", jurisdictionId=" + jurisdictionId +
                ", roleId=" + roleId +
                ", jurisdiction=" + jurisdiction +
                ", role=" + role +
                '}';
    }
}
