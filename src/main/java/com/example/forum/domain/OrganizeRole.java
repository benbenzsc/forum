package com.example.forum.domain;

public class OrganizeRole {
    private Integer organize_role_id;
    private Integer organize_id;
    private Integer user_id;
    private Organize organize;
    private UserLogin userLogin;

    public OrganizeRole() {
    }

    public OrganizeRole(Integer organize_role_id, Integer organize_id, Integer user_id) {
        this.organize_role_id = organize_role_id;
        this.organize_id = organize_id;
        this.user_id = user_id;
    }

    public OrganizeRole(Integer organize_role_id, Organize organize, UserLogin userLogin) {
        this.organize_role_id = organize_role_id;
        this.organize = organize;
        this.userLogin = userLogin;
    }

    public Integer getOrganize_role_id() {
        return organize_role_id;
    }

    public void setOrganize_role_id(Integer organize_role_id) {
        this.organize_role_id = organize_role_id;
    }

    public Integer getOrganize_id() {
        return organize_id;
    }

    public void setOrganize_id(Integer organize_id) {
        this.organize_id = organize_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Organize getOrganize() {
        return organize;
    }

    public void setOrganize(Organize organize) {
        this.organize = organize;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    @Override
    public String toString() {
        return "OrganizeRole{" +
                "organize_role_id=" + organize_role_id +
                ", organize_id=" + organize_id +
                ", user_id=" + user_id +
                ", organize=" + organize +
                ", userLogin=" + userLogin +
                '}';
    }
}
