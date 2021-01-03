package com.example.forum.domain;

public class Role {
    private Integer roleId;
    private String roleName;
    private Integer jurisdiction_id;
    private UserLogin userLogin;

    public Role() {
    }

    public Role(Integer roleId, String roleName, Integer jurisdiction_id) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.jurisdiction_id = jurisdiction_id;
    }

    public Role(String roleName, Integer jurisdiction_id, UserLogin userLogin) {
        this.roleName = roleName;
        this.jurisdiction_id = jurisdiction_id;
        this.userLogin = userLogin;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getJurisdiction_id() {
        return jurisdiction_id;
    }

    public void setJurisdiction_id(Integer jurisdiction_id) {
        this.jurisdiction_id = jurisdiction_id;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", jurisdiction_id=" + jurisdiction_id +
                ", userLogin=" + userLogin +
                '}';
    }
}
