package com.example.forum.domain;

public class Organize {
    private Integer organizeId;
    private String organizeName;

    public Organize() {
    }

    public Organize(Integer organizeId, String organizeName) {
        this.organizeId = organizeId;
        this.organizeName = organizeName;
    }

    public Integer getOrganizeId() {
        return organizeId;
    }

    public void setOrganizeId(Integer organizeId) {
        this.organizeId = organizeId;
    }

    public String getOrganizeName() {
        return organizeName;
    }

    public void setOrganizeName(String organizeName) {
        this.organizeName = organizeName;
    }

    @Override
    public String toString() {
        return "Organizes{" +
                "organizeId=" + organizeId +
                ", organizeName='" + organizeName + '\'' +
                '}';
    }
}
