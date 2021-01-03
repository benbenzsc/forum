package com.example.forum.domain;

public class UserRole {
    private Integer user_role_id;
    private Integer user_id;
    private Integer role_id;
    private UserLogin userLogin;
    private Role role;

    public UserRole() {
    }

    public UserRole(Integer user_role_id, Integer user_id, Integer role_id) {
        this.user_role_id = user_role_id;
        this.user_id = user_id;
        this.role_id = role_id;
    }

    public UserRole(Integer user_role_id, UserLogin userLogin, Role role) {
        this.user_role_id = user_role_id;
        this.userLogin = userLogin;
        this.role = role;
    }

    public Integer getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(Integer user_role_id) {
        this.user_role_id = user_role_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "user_role_id=" + user_role_id +
                ", user_id=" + user_id +
                ", role_id=" + role_id +
                ", userLogin=" + userLogin +
                ", role=" + role +
                '}';
    }
}
