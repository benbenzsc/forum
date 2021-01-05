package com.example.forum.domain;

public class Classify {
    private Integer classifyId;
    private String classifyName;
    private Integer classifyLeft;
    private Integer classifyRight;

    public Classify() {
    }

    public Classify(Integer classifyId, String classifyName, Integer classifyLeft, Integer classifyRight) {
        this.classifyId = classifyId;
        this.classifyName = classifyName;
        this.classifyLeft = classifyLeft;
        this.classifyRight = classifyRight;
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public Integer getClassifyLeft() {
        return classifyLeft;
    }

    public void setClassifyLeft(Integer classifyLeft) {
        this.classifyLeft = classifyLeft;
    }

    public Integer getClassifyRight() {
        return classifyRight;
    }

    public void setClassifyRight(Integer classifyRight) {
        this.classifyRight = classifyRight;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "classifyId=" + classifyId +
                ", classifyName='" + classifyName + '\'' +
                ", classifyLeft=" + classifyLeft +
                ", classifyRight=" + classifyRight +
                '}';
    }
}
